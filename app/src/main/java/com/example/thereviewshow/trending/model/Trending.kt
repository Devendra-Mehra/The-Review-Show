package com.example.thereviewshow.trending.model

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class Trending(
    @SerializedName("original_name") val originalName: String? = null,
    @SerializedName("id") val id: Double? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("vote_count") val voteCount: Double? = null,
    @SerializedName("vote_average") val voteAverage: Float? = null,
    @SerializedName("first_air_date") val releaseDate: String? = null,
    @SerializedName("poster_path") val posterPath: String? = null,
    @SerializedName("genre_ids") val genreIds: List<Int>? = null,
    @SerializedName("original_language") val originalLanguage: String? = null,
    @SerializedName("backdrop_path") val backdropPath: String? = null,
    @SerializedName("overview") val overview: String? = null,
    @SerializedName("origin_country") val originCountry: List<String>? = null,
    @SerializedName("popularity") val popularity: Double? = null,
    @SerializedName("media_type") val mediaType: String? = null
) : Parcelable