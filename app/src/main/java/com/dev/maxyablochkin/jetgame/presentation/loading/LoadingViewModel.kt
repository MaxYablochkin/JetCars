package com.dev.maxyablochkin.jetgame.presentation.loading

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class LoadingViewModel : ViewModel() {
    private val _loadingState = MutableStateFlow(LoadingState())
    val loadingState = _loadingState.asStateFlow()

    fun onAction(action: LoadingAction) {
        when (action) {
            LoadingAction.ProgressChange -> progressChange()
        }
    }

    private fun progressChange() {
        viewModelScope.launch {
            delay(1000L)
            _loadingState.update { state -> state.copy(progress = state.progress + 0.16f) }
            delay(2000L)
            _loadingState.update { state -> state.copy(progress = state.progress + 0.16f) }
            delay(2000L)
            _loadingState.update { state -> state.copy(progress = state.progress + 0.16f) }
            delay(1000L)
            _loadingState.update { state -> state.copy(progress = state.progress + 0.16f) }
            delay(2000L)
            _loadingState.update { state -> state.copy(progress = state.progress + 0.16f) }
            delay(1000L)
            _loadingState.update { state -> state.copy(progress = state.progress + 0.16f) }
            delay(500L)
        }
    }
}