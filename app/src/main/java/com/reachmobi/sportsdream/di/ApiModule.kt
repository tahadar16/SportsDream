package com.reachmobi.sportsdream.di


import com.reachmobi.sportsdream.BuildConfig
import com.reachmobi.sportsdream.network.ApiHelper
import com.reachmobi.sportsdream.network.ApiHelperImpl
import com.reachmobi.sportsdream.network.ApiService
import com.reachmobi.sportsdream.network.WebConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {

    @Provides
    fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
    } else {
        OkHttpClient.Builder()
    }

    @Provides
    fun provideApi(clientBuilder: OkHttpClient.Builder): Retrofit =
        Retrofit.Builder().baseUrl(WebConfig.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(clientBuilder.build()).build()


    @Provides
    fun provideApiService(retrofit: Retrofit) = retrofit.create(ApiService::class.java)

    @Provides
    fun provideApiHelper(apiHelper: ApiHelperImpl): ApiHelper = apiHelper

}