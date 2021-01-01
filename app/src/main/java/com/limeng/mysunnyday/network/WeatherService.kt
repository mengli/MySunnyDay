package com.limeng.mysunnyday.network

import com.limeng.mysunnyday.network.response.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

  @GET("onecall")
  suspend fun getWeather(
    @Query("lat") lat: Float,
    @Query("lon") lon: Float,
    @Query("exclude") exclude: String,
    @Query("appid") appId: String): WeatherResponse
}