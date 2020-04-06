package com.example.thereviewshow.trending.di

import com.example.core.di.coroutines.CoroutinesManager
import com.example.core.di.coroutines.DefaultCoroutinesManager
import com.example.core.di.coroutines.asynctaskmanager.AsyncTaskManager
import com.example.core.di.coroutines.asynctaskmanager.DefaultAsyncTaskManager
import com.example.thereviewshow.trending.model.TrendingClient
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class TrendingModule {

    @Provides
    fun provideContext(retrofit: Retrofit): TrendingClient {
        return retrofit.create(TrendingClient::class.java)
    }

    @Provides
    fun providesAsyncTaskManager(): AsyncTaskManager = DefaultAsyncTaskManager()

    @Provides
    fun providesCoroutinesManager(): CoroutinesManager = DefaultCoroutinesManager()

}


