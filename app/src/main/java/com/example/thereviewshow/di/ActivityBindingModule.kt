package com.example.di


import com.example.thereviewshow.trending.ui.TrendingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    abstract fun homeTrendingActivity(): TrendingActivity
}