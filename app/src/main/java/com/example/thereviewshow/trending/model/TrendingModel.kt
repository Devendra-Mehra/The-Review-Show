package com.example.thereviewshow.trending.model

import com.example.core.di.utils.NetworkResponse
import com.example.core.di.coroutines.asynctaskmanager.AsyncTaskManager
import javax.inject.Inject

class TrendingModel @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    asyncTaskManager: AsyncTaskManager
) : AsyncTaskManager by asyncTaskManager {

    suspend fun getTrending(mediaType: String, mediaTime: String):
            NetworkResponse<Trending> = asyncAwait {
        remoteDataSource.getTrending(mediaType, mediaTime)
    }
}