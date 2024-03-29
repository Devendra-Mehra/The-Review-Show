package com.example.core.di

import android.content.Context
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ImageModule {

    @Provides
    @Singleton
    fun providesPicasso(context: Context): Picasso = Picasso.Builder(context).build()

}