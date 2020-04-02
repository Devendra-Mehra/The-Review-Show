package com.example.thereviewshow.di

import androidx.lifecycle.ViewModel
import com.example.thereviewshow.trending.viewmodle.TrendingViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(TrendingViewModel::class)
    abstract fun bindTrendingViewModel(trendingViewModel: TrendingViewModel): ViewModel

}