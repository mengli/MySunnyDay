package com.limeng.mysunnyday.domain

class Weather (
  val lat: Float,
  val lon: Float,
  val timezone: String,
  val timezoneOffset: Int,
  val current: HourlyWeather,
  val hourly: List<HourlyWeather>,
  val daily: List<DailyWeather>,
)