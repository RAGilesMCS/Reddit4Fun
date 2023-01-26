package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class LinkFlairRichtext(
    @SerializedName("a")
    val a: String? = null,
    @SerializedName("e")
    val e: String? = null,
    @SerializedName("t")
    val t: String? = null,
    @SerializedName("u")
    val u: String? = null
)