package com.example.thereviewshow.util

import android.content.Context
import com.example.thereviewshow.R
import javax.inject.Inject

class StringHelper @Inject constructor(private val context: Context) {

    fun getAppName() = context.resources.getString(R.string.app_name)
}