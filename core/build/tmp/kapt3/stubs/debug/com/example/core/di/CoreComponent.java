package com.example.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/core/di/CoreComponent;", "", "picasso", "Lcom/squareup/picasso/Picasso;", "retrofit", "Lretrofit2/Retrofit;", "core_debug"})
@dagger.Component(modules = {com.example.core.di.CoreModule.class, com.example.core.di.NetworkModule.class, com.example.core.di.GsonModule.class, com.example.core.di.ImageModule.class, com.example.core.di.StorageModule.class})
@javax.inject.Singleton()
public abstract interface CoreComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.squareup.picasso.Picasso picasso();
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Retrofit retrofit();
}