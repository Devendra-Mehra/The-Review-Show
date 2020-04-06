package com.example.di

import android.app.Application
import android.os.Build
import com.example.core.di.CoreComponent
import com.example.thereviewshow.application.TheReviewShowApplication
import com.example.thereviewshow.di.ViewModelModule
import com.example.thereviewshow.trending.di.TrendingModule
import com.example.thereviewshow.trending.di.TrendingScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [AppModule::class,
        ViewModelModule::class,
        TrendingModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class],
    dependencies = [CoreComponent::class]
)
@AppScope
interface AppComponent : AndroidInjector<TheReviewShowApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun coreComponent(coreComponent: CoreComponent): Builder

        fun build(): AppComponent
    }
}