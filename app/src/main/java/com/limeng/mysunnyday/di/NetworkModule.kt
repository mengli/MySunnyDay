package com.limeng.mysunnyday.di

import com.google.gson.GsonBuilder
import com.limeng.mysunnyday.domain.Weather
import com.limeng.mysunnyday.network.WeatherService
import com.limeng.mysunnyday.network.mapper.WeatherNetworkMapper
import com.limeng.mysunnyday.network.response.WeatherResponse
import com.limeng.mysunnyday.utils.DomainMapper
import com.limeng.mysunnyday.utils.WEATHER_API_BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

  @Singleton
  @Provides
  fun provideWeatherService(): WeatherService {
    return Retrofit.Builder()
      .baseUrl(WEATHER_API_BASE_URL)
      .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
      .build()
      .create(WeatherService::class.java)
  }

  @Singleton
  @Provides
  fun provideWeatherNetworkMapper(): DomainMapper<WeatherResponse, Weather> {
    return WeatherNetworkMapper()
  }
}