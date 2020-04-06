package com.example.thereviewshow.trending.model

import com.example.core.di.utils.NetworkResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface TrendingClient {

    @GET("trending/{media_type}/{media_time}")
    suspend fun getTrending(
        @Path(value = "media_type") mediaType: String,
        @Path(value = "media_time") mediaTime: String
    ): NetworkResponse<Trending>


}