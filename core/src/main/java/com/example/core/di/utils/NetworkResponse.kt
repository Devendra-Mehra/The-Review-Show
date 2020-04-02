package com.example.core.di.utils

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class NetworkResponse<R>(
    @SerializedName("page") val page: Int? = null,
    @SerializedName("total_pages") val totalPages: Int? = null,
    @SerializedName("total_results") val totalResults: Int? = null,
    @SerializedName("result") val results: List<R>? = null
)