package com.example.reddit4fun.rest

import com.example.reddit4fun.model.redditContentModel.Data

sealed class UIState<out T> {
    object Loading : UIState<Nothing>()
    data class SUCCESS<T>(val response: T) : UIState<T>()
    data class ERROR(val error: Exception) : UIState<Nothing>()
}