package com.limeng.mysunnyday.network.model

import com.google.gson.annotations.SerializedName

data class WeatherDetailDto (
  @SerializedName("id")
  val id: Int,
  @SerializedName("main")
  val main: String,
  @SerializedName("description")
  val description: String,
  @SerializedName("icon")
  val icon: String,
)
