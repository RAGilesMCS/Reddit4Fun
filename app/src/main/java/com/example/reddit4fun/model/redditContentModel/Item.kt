package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("media_id")
    val mediaId: String? = null
)