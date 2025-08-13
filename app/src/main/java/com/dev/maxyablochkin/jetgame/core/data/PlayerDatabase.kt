package com.dev.maxyablochkin.jetgame.core.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PlayerEntity::class], version = 1)
abstract class PlayerDatabase : RoomDatabase() {
    abstract val playerDao: PlayerDao

    companion object {
        const val DATABASE_NAME = "Player_Db"
    }
}