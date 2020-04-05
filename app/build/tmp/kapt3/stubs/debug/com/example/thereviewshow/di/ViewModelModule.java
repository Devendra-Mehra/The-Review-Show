package com.example.thereviewshow.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/thereviewshow/di/ViewModelModule;", "", "()V", "bindTrendingViewModel", "Landroidx/lifecycle/ViewModel;", "trendingViewModel", "Lcom/example/thereviewshow/trending/viewmodle/TrendingViewModel;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.example.thereviewshow.trending.viewmodle.TrendingViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindTrendingViewModel(@org.jetbrains.annotations.NotNull()
    com.example.thereviewshow.trending.viewmodle.TrendingViewModel trendingViewModel);
    
    public ViewModelModule() {
        super();
    }
}