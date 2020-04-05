package com.example.thereviewshow.trending.model

import com.example.core.di.utils.NetworkResponse
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val trendingClientImpl: TrendingClientImpl
) {

    fun getTrending(mediaType: String, mediaTime: String): NetworkResponse<Trending> =
        trendingClientImpl.getTrending(mediaType, mediaTime)

}