package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class RedditVideoPreview(
    @SerializedName("bitrate_kbps")
    val bitrateKbps: Int? = null,
    @SerializedName("dash_url")
    val dashUrl: String? = null,
    @SerializedName("duration")
    val duration: Int? = null,
    @SerializedName("fallback_url")
    val fallbackUrl: String? = null,
    @SerializedName("height")
    val height: Int? = null,
    @SerializedName("hls_url")
    val hlsUrl: String? = null,
    @SerializedName("is_gif")
    val isGif: Boolean? = null,
    @SerializedName("scrubber_media_url")
    val scrubberMediaUrl: String? = null,
    @SerializedName("transcoding_status")
    val transcodingStatus: String? = null,
    @SerializedName("width")
    val width: Int? = null
)