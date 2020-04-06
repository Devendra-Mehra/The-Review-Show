package com.example.thereviewshow.trending.viewmodle

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.thereviewshow.trending.model.TrendingModel
import com.example.thereviewshow.util.StringHelper
import com.example.core.di.coroutines.CoroutinesManager
import com.example.core.di.utils.MediaTime
import com.example.core.di.utils.MediaType
import javax.inject.Inject

class TrendingViewModel @Inject constructor(
    private val stringHelper: StringHelper,
    private val trendingModel: TrendingModel,
    private val coroutinesManager: CoroutinesManager
) : ViewModel(), CoroutinesManager by coroutinesManager {

    fun getAppName(): String = stringHelper.getAppName()


    fun getTrending(mediaType: String, mediaTime: String) {
        launchOnUITryCatch({
            val trending = trendingModel.getTrending(mediaType, mediaTime)
            Log.d("Log24", "$trending")
        }, {
            Log.d("Log24", "${it.message}")
        })
    }

    override fun onCleared() {
        cancelAllCoroutines()
        super.onCleared()
    }
}