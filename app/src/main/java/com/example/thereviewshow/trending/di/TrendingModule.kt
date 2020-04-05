package com.example.thereviewshow.trending.di

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
}

