package com.reachmobi.sportsdream.di

import com.reachmobi.sportsdream.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class, ApiModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}