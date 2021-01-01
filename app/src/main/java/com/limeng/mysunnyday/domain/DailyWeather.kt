package com.limeng.mysunnyday.domain

data class DailyWeather(
  val dt: Long,
  val sunrise: Long,
  val sunset: Long,
  val temp: DailyTemperature,
  val feelsLike: DailyTemperature,
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