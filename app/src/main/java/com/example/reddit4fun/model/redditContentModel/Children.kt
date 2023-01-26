package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class Children(
    @SerializedName("data")
    val `data`: DataX? = DataX(),
    @SerializedName("kind")
    val kind: String? = ""
)