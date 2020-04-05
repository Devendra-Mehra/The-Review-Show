package com.example.thereviewshow.trending.viewmodle

import androidx.lifecycle.ViewModel
import com.example.thereviewshow.trending.model.TrendingModel
import com.example.thereviewshow.util.StringHelper
import javax.inject.Inject

class TrendingViewModel @Inject constructor(
    private val stringHelper: StringHelper,
    private val trendingModel: TrendingModel
) :
    ViewModel() {

    fun getAppName(): String = stringHelper.getAppName()

}