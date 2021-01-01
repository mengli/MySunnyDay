package com.limeng.mysunnyday.domain

data class HourlyWeather(
  val dt: Long,
  val sunrise: Long,
  val sunset: Long,
  val temp: Float,
  val feelsLike: Float,
  val pressure: Int,
  val humidity: Int,
  val dewPoint: Float,
  val uvi: Int,
  val clouds: Int,
  val visibility: Int,
  val windSpeed: Float,
  val windDeg: Float,
  val weatherDetail: WeatherDetail
)