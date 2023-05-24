package com.reachmobi.sportsdream.di

import com.reachmobi.sportsdream.repository.PlayerRepository
import com.reachmobi.sportsdream.repository.PlayerRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    fun providePlayerRepo(impl : PlayerRepositoryImpl): PlayerRepository = impl
}