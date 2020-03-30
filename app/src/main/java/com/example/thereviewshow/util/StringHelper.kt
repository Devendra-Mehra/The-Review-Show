package com.example.thereviewshow.util

import android.content.Context
import com.example.thereviewshow.R

class StringHelper constructor(private val context: Context) {


    fun getAppName() = context.resources.getString(R.string.app_name)
}