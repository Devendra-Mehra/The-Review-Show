package com.example.di


import com.example.thereviewshow.homescreen.ui.HomeScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    abstract fun homeScreenActivity(): HomeScreenActivity
}