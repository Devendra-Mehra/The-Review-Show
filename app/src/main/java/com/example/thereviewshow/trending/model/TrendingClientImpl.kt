package com.example.thereviewshow.trending.model

import com.example.core.di.utils.NetworkResponse
import javax.inject.Inject

class TrendingClientImpl @Inject constructor(private val trendingClient: TrendingClient) {

    fun getTrending(mediaType: String, mediaTime: String): NetworkResponse<Trending> =
        trendingClient.getTrending(mediaType, mediaTime)
}