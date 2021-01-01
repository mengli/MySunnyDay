package com.limeng.mysunnyday.di

import android.content.Context
import com.limeng.mysunnyday.MySunnyDay
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module(includes = [RepositoryModule::class])
@InstallIn(ApplicationComponent::class)
object AppModule {

  @Singleton
  @Provides
  fun provideApplication(
    @ApplicationContext appContext: Context
  ): MySunnyDay {
    return appContext as MySunnyDay
  }
}