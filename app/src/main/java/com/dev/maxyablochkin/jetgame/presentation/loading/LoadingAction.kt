package com.dev.maxyablochkin.jetgame.presentation.loading

sealed interface LoadingAction {
    data object ProgressChange : LoadingAction
}