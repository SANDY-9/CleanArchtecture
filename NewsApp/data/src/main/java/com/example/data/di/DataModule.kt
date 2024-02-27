package com.example.data.di

import android.content.Context
import com.example.data.manager.LocalUserManagerImpl
import com.example.domain.manager.LocalUserManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Singleton
    @Provides
    fun provideLocalUserManager(@ApplicationContext context: Context): LocalUserManager {
        return LocalUserManagerImpl(context)
    }

}