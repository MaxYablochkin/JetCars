package com.dev.maxyablochkin.jetgame.presentation.result

import androidx.lifecycle.ViewModel
import com.dev.maxyablochkin.jetgame.core.data.PlayerDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ResultViewModel @Inject constructor (database: PlayerDatabase) : ViewModel() {
    val getPlayerData = database.playerDao.getPlayerData()
}