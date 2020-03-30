package com.example.core.di

import com.squareup.picasso.Picasso
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(
    modules = [CoreModule::class, NetworkModule::class,
        GsonModule::class, ImageModule::class, StorageModule::class]
)
interface CoreComponent {

    fun picasso(): Picasso

    fun retrofit(): Retrofit

}