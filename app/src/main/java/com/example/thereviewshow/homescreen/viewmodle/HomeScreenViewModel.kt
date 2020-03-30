package com.example.thereviewshow.homescreen.viewmodle

import androidx.lifecycle.ViewModel
import com.example.thereviewshow.util.StringHelper

class HomeScreenViewModel constructor(private val stringHelper: StringHelper) : ViewModel() {


    fun getAppName(): String = stringHelper.getAppName()

}