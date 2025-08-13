package com.dev.maxyablochkin.jetgame.presentation.game

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dev.maxyablochkin.jetgame.core.data.PlayerDatabase
import com.dev.maxyablochkin.jetgame.core.data.PlayerEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class GameViewModel @Inject constructor(val database: PlayerDatabase) : ViewModel() {
    private val _state = MutableStateFlow(GameState())
    val state = _state.asStateFlow()

    private var tickJob: Job? = null
    private var gameStartTime: Long = 0L

    init {
        startGame()
    }

    fun onAction(action: GameAction) {
        when (action) {
            is GameAction.MoveCar -> moveCar(action.direction)
            GameAction.Tick -> gameTick()
            GameAction.Restart -> restart()
            is GameAction.SavePlayer -> savePlayerScore(action.player)
        }
    }

    private fun savePlayerScore(player: PlayerEntity) {
        viewModelScope.launch {
            database.playerDao.savePlayer(player)
        }
    }

    private fun startGame() {
        tickJob?.cancel()
        _state.value = GameState()
        gameStartTime = System.currentTimeMillis()
        tickJob = viewModelScope.launch {
            while (!_state.value.isGameOver) {
                delay(16L)
                onAction(GameAction.Tick)
            }
        }
    }

    private fun moveCar(direction: Direction) {
        _state.update { state ->
            if (state.isGameOver) return@update state
            val step = 0.05f
            val newX = when (direction) {
                Direction.LEFT -> (state.carX - step).coerceAtLeast(0f)
                Direction.RIGHT -> (state.carX + step).coerceAtMost(1f - state.carSize)
            }
            state.copy(carX = newX)
        }
    }

    private fun gameTick() {
        _state.update { state ->
            if (state.isGameOver) return@update state
            val currentDifficultyTime = System.currentTimeMillis() - gameStartTime
            val newSpeed = (0.005f + (currentDifficultyTime / 20000f) * 0.002f).coerceAtMost(0.02f)

            var currentScore = state.score
            val updatedObstacles = state.obstacles.map { obs ->
                val newY = obs.y + newSpeed
                if (!obs.isScored && newY >= 1.0f) {
                    currentScore++
                    obs.copy(y = newY, isScored = true)
                } else {
                    obs.copy(y = newY)
                }
            }.filter { it.y < 1.1f }

            val spawnChance = 0.02f + (currentDifficultyTime / 30000f) * 0.005f
            val addObstacle = Random.nextFloat() < spawnChance
            val obstacleNormalizedSize = 0.1f

            val newObstaclesUpdated =
                if (addObstacle && updatedObstacles.none { it.y < obstacleNormalizedSize * 2 }) {
                    val newX = Random.nextFloat().coerceIn(0f, 1f - obstacleNormalizedSize)
                    updatedObstacles + Obstacle(x = newX, y = 0f, size = obstacleNormalizedSize)
                } else {
                    updatedObstacles
                }

            val carSizeForCollision = state.carSize

            val carRect = Rect(
                left = state.carX,
                top = 1.0f - carSizeForCollision,
                right = state.carX + carSizeForCollision,
                bottom = 1.0f
            )

            val isCollision = newObstaclesUpdated.any { obs ->
                val obsRect = Rect(
                    left = obs.x,
                    top = obs.y,
                    right = obs.x + obs.size,
                    bottom = obs.y + obs.size
                )
                obsRect.intersects(carRect)
            }

            if (isCollision) {
                state.copy(isGameOver = true, score = currentScore)
            } else {
                state.copy(
                    obstacles = newObstaclesUpdated,
                    score = currentScore,
                    speed = newSpeed,
                    difficultyTime = currentDifficultyTime
                )
            }
        }
    }

    private fun restart() = startGame()
}

data class Rect(val left: Float, val top: Float, val right: Float, val bottom: Float)

fun Rect.intersects(other: Rect): Boolean {
    return this.left < other.right &&
            this.right > other.left &&
            this.top < other.bottom &&
            this.bottom > other.top
}
