package com.limeng.mysunnyday.di

import com.limeng.mysunnyday.repository.WeatherRepository
import com.limeng.mysunnyday.repository.WeatherRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule {

  @Singleton
  @Binds
  abstract fun provideWeatherRepository(
    weatherRepositoryImpl: WeatherRepositoryImpl
  ): WeatherRepository
}