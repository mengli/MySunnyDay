package com.limeng.mysunnyday.network.mapper

import com.limeng.mysunnyday.domain.Weather
import com.limeng.mysunnyday.network.response.WeatherResponse
import com.limeng.mysunnyday.utils.DomainMapper

class WeatherNetworkMapper : DomainMapper<WeatherResponse, Weather> {

  override fun mapToDomainModel(model: WeatherResponse): Weather {
    TODO("Not yet implemented")
  }
}