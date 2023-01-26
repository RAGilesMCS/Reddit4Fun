package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("resolutions")
    val resolutions: List<Resolution>? = listOf(),
    @SerializedName("source")
    val source: Source? = Source(),
    @SerializedName("variants")
    val variants: Variants? = Variants()
)