package com.example.thereviewshow.application

import com.example.core.di.CoreComponent
import com.example.core.di.CoreComponentProvider
import com.example.core.di.CoreModule
import com.example.core.di.DaggerCoreComponent
import com.example.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class TheReviewShowApplication : DaggerApplication(), CoreComponentProvider {

    private lateinit var coreComponent: CoreComponent


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
            .builder()
            .application(this)
            .coreComponent(provideCoreComponent())
            .build()
    }

    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                .builder()
                .coreModule(CoreModule(this))
                .build()
        }
        return coreComponent
    }

}