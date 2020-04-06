package com.example.core.di

import android.content.Context
import com.example.core.di.NetworkModule.BaseUrl.KEY
import com.example.core.di.NetworkModule.BaseUrl.VALUE
import com.readystatesoftware.chuck.ChuckInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
class NetworkModule {


    @Provides
    @Singleton
    fun providesOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
        chuckInterceptor: ChuckInterceptor
    ): OkHttpClient {
        val client = OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
        client.apply {
            addInterceptor(httpLoggingInterceptor)
            addInterceptor(chuckInterceptor)
            addInterceptor { chain ->
                val original = chain.request()
                val url = original.url().newBuilder()
                    .addQueryParameter(KEY, VALUE)
                    .build()
                val requestBuilder = original.newBuilder()
                    .url(url).build()
                chain.proceed(requestBuilder)
            }
        }

        return client.build()
    }

    @Provides
    @Singleton
    fun providesLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }


    @Provides
    @Singleton
    fun providesRetrofit(
        gsonConverterFactory: GsonConverterFactory,
        okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder().baseUrl(BaseUrl.theMovieDb)
            .addConverterFactory(gsonConverterFactory)
            .client(okHttpClient)
            .build()
    }

    @Provides
    @Singleton
    fun providesChuckInterceptor(context: Context): ChuckInterceptor {
        return ChuckInterceptor(context)
    }

    object BaseUrl {
        const val KEY = "api_key"
        const val VALUE = "c329a39a2e407e774a1e9e9a9bd4189b"
        const val theMovieDb = "https://api.themoviedb.org/3/"
    }
}