package com.dev.maxyablochkin.jetgame.core.di

import android.content.Context
import androidx.room.Room
import com.dev.maxyablochkin.jetgame.core.data.PlayerDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun providesPlayerDatabase(@ApplicationContext context: Context): PlayerDatabase {
        return Room.databaseBuilder(
            context = context.applicationContext,
            klass = PlayerDatabase::class.java,
            name = PlayerDatabase.DATABASE_NAME
        ).fallbackToDestructiveMigration().build()
    }
}