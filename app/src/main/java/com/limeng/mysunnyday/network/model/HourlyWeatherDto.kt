package com.limeng.mysunnyday.network.model

import com.google.gson.annotations.SerializedName

data class HourlyWeatherDto(
  @SerializedName("dt")
  val dt: Long,
  @SerializedName("sunrise")
  val sunrise: Long,
  @SerializedName("sunset")
  val sunset: Long,
  @SerializedName("temp")
  val temp: Float,
  @SerializedName("feels_like")
  val feelsLike: Float,
  @SerializedName("pressure")
  val pressure: Int,
  @SerializedName("humidity")
  val humidity: Int,
  @SerializedName("dew_point")
  val dewPoint: Float,
  @SerializedName("uvi")
  val uvi: Int,
  @SerializedName("clouds")
  val clouds: Int,
  @SerializedName("visibility")
  val visibility: Int,
  @SerializedName("wind_speed")
  val windSpeed: Float,
  @SerializedName("wind_deg")
  val windDeg: Float,
  @SerializedName("weather")
  val weatherDetail: WeatherDetailDto
)