package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class ResizedStaticIcon(
    @SerializedName("height")
    val height: Int? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("width")
    val width: Int? = null
)