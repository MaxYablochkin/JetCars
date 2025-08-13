package com.dev.maxyablochkin.jetgame.presentation.game

data class Obstacle(val x: Float, val y: Float, val size: Float, val isScored: Boolean = false)

data class GameState(
    val carX: Float = 0.5f,
    val carSize: Float = 0.1f,
    val obstacles: List<Obstacle> = emptyList(),
    val score: Int = 0,
    val speed: Float = 0.005f,
    val isGameOver: Boolean = false,
    val difficultyTime: Long = 0L
)
