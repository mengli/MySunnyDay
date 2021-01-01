package com.limeng.mysunnyday.domain

data class DailyTemperature(
  val day: Float,
  val min: Float?,
  val max: Float?,
  val night: Float,
  val eve: Float,
  val morn: Float,
)