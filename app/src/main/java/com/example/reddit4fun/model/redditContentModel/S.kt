package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class S(
    @SerializedName("u")
    val u: String? = null,
    @SerializedName("x")
    val x: Int? = null,
    @SerializedName("y")
    val y: Int? = null
)