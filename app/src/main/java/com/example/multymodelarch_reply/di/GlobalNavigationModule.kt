package com.example.multymodelarch_reply.di

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class GlobalNavigationModule {

    private val mCicerone: Cicerone<Router> = Cicerone.create()

    @Provides
    @Singleton
    fun provideRouter(): Router = mCicerone.router

    @Provides
    @Singleton
    fun provideNavigatorHolder(): NavigatorHolder = mCicerone.getNavigatorHolder()

}