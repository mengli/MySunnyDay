package com.limeng.mysunnyday.repository

import com.limeng.mysunnyday.domain.Weather
import com.limeng.mysunnyday.network.WeatherService
import com.limeng.mysunnyday.network.response.WeatherResponse
import com.limeng.mysunnyday.utils.DomainMapper
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
  private val weatherService: WeatherService,
  private val mapper: DomainMapper<WeatherResponse, Weather>
) : WeatherRepository {

  override suspend fun getWeather(
    lat: Float,
    lon: Float,
    exclude: String,
    appId: String
  ): Weather {
    return mapper.mapToDomainModel(weatherService.getWeather(lat, lon, exclude, appId))
  }
}