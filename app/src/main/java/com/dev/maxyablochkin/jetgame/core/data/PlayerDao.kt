package com.dev.maxyablochkin.jetgame.core.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PlayerDao {
    @Insert
    suspend fun savePlayer(player: PlayerEntity)

    @Query("SELECT * FROM Player_Db")
    fun getPlayerData(): Flow<List<PlayerEntity>>
}