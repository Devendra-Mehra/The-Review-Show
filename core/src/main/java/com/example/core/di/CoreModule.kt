package com.example.core.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class CoreModule(private val context: Context) {

    @Provides
    @Singleton
    fun providesContext(): Context {
        return context
    }
}