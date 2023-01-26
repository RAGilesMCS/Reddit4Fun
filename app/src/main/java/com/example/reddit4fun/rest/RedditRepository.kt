package com.example.reddit4fun.rest

import com.example.reddit4fun.model.redditContentModel.Data
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface RedditRepository {
    fun getData(): Flow<UIState<List<Data>>>

}