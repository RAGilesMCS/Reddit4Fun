package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class Media(
    @SerializedName("reddit_video")
    val redditVideo: RedditVideo? = null
)