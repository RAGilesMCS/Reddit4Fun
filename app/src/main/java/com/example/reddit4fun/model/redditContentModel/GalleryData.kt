package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class GalleryData(
    @SerializedName("items")
    val items: List<Item?>? = null
)