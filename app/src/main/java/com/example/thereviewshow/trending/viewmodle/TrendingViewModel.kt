package com.example.thereviewshow.trending.viewmodle

import androidx.lifecycle.ViewModel
import com.example.thereviewshow.util.StringHelper
import javax.inject.Inject

class TrendingViewModel @Inject constructor(private val stringHelper: StringHelper) :
    ViewModel() {

    fun getAppName(): String = stringHelper.getAppName()

}