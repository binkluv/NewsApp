package ru.mmnigmatullov.newsapp.data.api

import androidx.room.Query
import retrofit2.http.GET
import ru.mmnigmatullov.newsapp.utils.Constants.Companion.API_KEY

interface NewsService {

    @GET("/v2/everything")
    suspend fun getEverything(
        @retrofit2.http.Query("q") query: String,
        @retrofit2.http.Query("page") page: Int = 1,
        @retrofit2.http.Query("apiKey") apiKey: String = API_KEY
    )
    suspend fun getHeadlines(
        @retrofit2.http.Query("country") countryCode: String = "ru",
        @retrofit2.http.Query("page") page: Int = 1,
        @retrofit2.http.Query("apiKey") apiKey: String = API_KEY
    )
}