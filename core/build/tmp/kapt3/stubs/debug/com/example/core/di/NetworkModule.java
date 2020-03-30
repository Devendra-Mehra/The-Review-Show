package com.example.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\nH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/core/di/NetworkModule;", "", "()V", "providesOkHttpClient", "Lokhttp3/OkHttpClient;", "providesRetrofit", "Lretrofit2/Retrofit;", "gsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "rxJava2CallAdapterFactory", "Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "okHttpClient", "providesRxJavaCallAdapterFactory", "BaseUrl", "core_debug"})
@dagger.Module()
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient providesOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit providesRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory, @org.jetbrains.annotations.NotNull()
    retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory rxJava2CallAdapterFactory, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory providesRxJavaCallAdapterFactory() {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/core/di/NetworkModule$BaseUrl;", "", "()V", "theMovieDb", "", "core_debug"})
    public static final class BaseUrl {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String theMovieDb = "https://api.themoviedb.org/3/";
        public static final com.example.core.di.NetworkModule.BaseUrl INSTANCE = null;
        
        private BaseUrl() {
            super();
        }
    }
}