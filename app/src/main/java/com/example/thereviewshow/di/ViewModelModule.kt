package com.example.thereviewshow.di

import androidx.lifecycle.ViewModel
import com.example.thereviewshow.homescreen.viewmodle.HomeScreenViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(HomeScreenViewModel::class)
    abstract fun bindHomeScreenViewModel(homeScreenViewModel: HomeScreenViewModel): ViewModel

}