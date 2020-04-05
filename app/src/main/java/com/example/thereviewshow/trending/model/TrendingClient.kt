package com.example.thereviewshow.trending.model

import com.example.core.di.utils.API_KEY
import com.example.core.di.utils.NetworkResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.POST
import retrofit2.http.Path

interface TrendingClient {

    @POST("trending/{media_type}/{media_time}$API_KEY")
    fun getTrending(
        @Path(value = "media_type") mediaType: String,
        @Path(value = "media_time") mediaTime: String
    ): NetworkResponse<Trending>


}