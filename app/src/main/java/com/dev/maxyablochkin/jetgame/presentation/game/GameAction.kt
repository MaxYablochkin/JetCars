package com.dev.maxyablochkin.jetgame.presentation.game

import com.dev.maxyablochkin.jetgame.core.data.PlayerEntity

enum class Direction {
    LEFT,
    RIGHT
}

sealed interface GameAction {
    data class MoveCar(val direction: Direction) : GameAction
    object Tick : GameAction
    object Restart : GameAction
    data class SavePlayer(val player: PlayerEntity) : GameAction
}
