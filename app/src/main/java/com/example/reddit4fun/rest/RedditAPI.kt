package com.example.reddit4fun.rest

import com.example.reddit4fun.model.redditContentModel.Data
import retrofit2.Response
import retrofit2.http.GET

interface RedditAPI {

    @GET(BASE_URL)
    suspend fun getRedditContent(): Response<List<Data>>

}