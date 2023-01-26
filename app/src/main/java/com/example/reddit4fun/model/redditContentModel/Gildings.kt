package com.example.reddit4fun.model.redditContentModel


import com.google.gson.annotations.SerializedName

data class Gildings(
    @SerializedName("gid_1")
    val gid1: Int? = null,
    @SerializedName("gid_2")
    val gid2: Int? = null,
    @SerializedName("gid_3")
    val gid3: Int? = null
)