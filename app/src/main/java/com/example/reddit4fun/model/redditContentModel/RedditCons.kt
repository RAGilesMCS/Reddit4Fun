package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class RedditCons(
    @SerializedName("data")
    val `data`: Data? = Data(),
    @SerializedName("kind")
    val kind: String? = ""
)