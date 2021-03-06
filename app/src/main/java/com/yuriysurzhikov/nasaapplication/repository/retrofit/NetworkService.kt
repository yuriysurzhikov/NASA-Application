package com.yuriysurzhikov.nasaapplication.repository.retrofit

import com.yuriysurzhikov.nasaapplication.repository.retrofit.dailypost.DailyPostNetworkEntity
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NetworkService {
    @GET("planetary/apod")
    suspend fun getDailyPost(@Query("api_key") key: String): DailyPostNetworkEntity
}