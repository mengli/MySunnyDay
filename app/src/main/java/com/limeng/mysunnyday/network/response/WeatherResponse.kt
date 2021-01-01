package com.limeng.mysunnyday.network.response

import com.google.gson.annotations.SerializedName
import com.limeng.mysunnyday.network.model.DailyWeatherDto
import com.limeng.mysunnyday.network.model.HourlyWeatherDto

data class WeatherResponse(
  @SerializedName("lat")
  val lat: Float,
  @SerializedName("lon")
  val lon: Float,
  @SerializedName("timezone")
  val timezone: String,
  @SerializedName("timezone_offset")
  val timezoneOffset: Int,
  @SerializedName("current")
  val current: HourlyWeatherDto,
  @SerializedName("hourly")
  val hourly: List<HourlyWeatherDto>,
  @SerializedName("daily")
  val daily: List<DailyWeatherDto>,
)