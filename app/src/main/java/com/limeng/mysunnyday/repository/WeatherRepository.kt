package com.limeng.mysunnyday.repository

import com.limeng.mysunnyday.domain.Weather

interface WeatherRepository {

  suspend fun getWeather(
    lat: Float,
    lon: Float,
    exclude: String,
    appId: String): Weather
}