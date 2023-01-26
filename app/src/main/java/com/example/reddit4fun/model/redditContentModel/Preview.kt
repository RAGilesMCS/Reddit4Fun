package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class Preview(
    @SerializedName("enabled")
    val enabled: Boolean? = false,
    @SerializedName("images")
    val images: List<Image>? = listOf(),
    @SerializedName("reddit_video_preview")
    val redditVideoPreview: RedditVideoPreview? = RedditVideoPreview()
)