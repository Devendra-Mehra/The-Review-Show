package com.example.di

import android.app.Application
import com.example.core.di.CoreComponent
import com.example.thereviewshow.application.TheReviewShowApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [AppModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class],
    dependencies = [CoreComponent::class]
)
@AppScope
interface AppComponent : AndroidInjector<TheReviewShowApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun coreComponent(coreComponent: CoreComponent): AppComponent.Builder

        fun build(): AppComponent
    }
}