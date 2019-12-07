package com.example.core.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [CoreModule::class, NetworkModule::class,
        GsonModule::class, ImageModule::class, StorageModule::class]
)
interface CoreComponent