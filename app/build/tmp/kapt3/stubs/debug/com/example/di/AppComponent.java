package com.example.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/example/thereviewshow/application/TheReviewShowApplication;", "Builder", "app_debug"})
@AppScope()
@dagger.Component(modules = {com.example.di.AppModule.class, com.example.thereviewshow.di.ViewModelModule.class, com.example.di.ActivityBindingModule.class, dagger.android.support.AndroidSupportInjectionModule.class}, dependencies = {com.example.core.di.CoreComponent.class})
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.example.thereviewshow.application.TheReviewShowApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/di/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/example/di/AppComponent;", "coreComponent", "Lcom/example/core/di/CoreComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.example.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.di.AppComponent.Builder coreComponent(@org.jetbrains.annotations.NotNull()
        com.example.core.di.CoreComponent coreComponent);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.di.AppComponent build();
    }
}