package com.limeng.mysunnyday.ui.weathercontent

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.limeng.mysunnyday.repository.WeatherRepository

class WeatherContentViewModel @ViewModelInject constructor(
  private val weatherRepository: WeatherRepository
): ViewModel() {
}