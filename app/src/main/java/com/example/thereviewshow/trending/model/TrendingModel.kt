package com.example.thereviewshow.trending.model

import com.example.core.di.utils.NetworkResponse
import javax.inject.Inject

class TrendingModel @Inject constructor(private val remoteDataSource: RemoteDataSource) {

    fun getTrending(mediaType: String, mediaTime: String): NetworkResponse<Trending> =
        remoteDataSource.getTrending(mediaType, mediaTime)
}