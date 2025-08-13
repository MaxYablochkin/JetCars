package com.dev.maxyablochkin.jetgame.core.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dev.maxyablochkin.jetgame.core.data.PlayerDatabase.Companion.DATABASE_NAME

@Entity(tableName = DATABASE_NAME)
data class PlayerEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "player_id")
    val id: Long? = null,
    @ColumnInfo(name = "player_score")
    val score: Int
)