package com.dev.maxyablochkin.jetgame.presentation.navigation

import kotlinx.serialization.Serializable

sealed class AppNavGraph {
    @Serializable
    data object Loading : AppNavGraph()

    @Serializable
    data object Start : AppNavGraph()

    @Serializable
    data object Game : AppNavGraph()

    @Serializable
    data object Result : AppNavGraph()
}