package com.example.thereviewshow.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/thereviewshow/application/TheReviewShowApplication;", "Ldagger/android/DaggerApplication;", "Lcom/example/core/di/CoreComponentProvider;", "()V", "coreComponent", "Lcom/example/core/di/CoreComponent;", "applicationInjector", "Ldagger/android/AndroidInjector;", "provideCoreComponent", "app_debug"})
public final class TheReviewShowApplication extends dagger.android.DaggerApplication implements com.example.core.di.CoreComponentProvider {
    private com.example.core.di.CoreComponent coreComponent;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.core.di.CoreComponent provideCoreComponent() {
        return null;
    }
    
    public TheReviewShowApplication() {
        super();
    }
}