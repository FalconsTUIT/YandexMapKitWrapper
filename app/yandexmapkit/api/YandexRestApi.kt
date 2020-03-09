package com.mobilemedia.tanuki.yandexmapkit.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

internal class YandexRestApi {

    private fun buildOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
            .connectTimeout(TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
            .build()
    }

    private fun buildRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(buildOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    companion object {

        private const val BASE_URL = "https://geocode-maps.yandex.ru/1.x/"
        private const val TIMEOUT_IN_SECONDS = 10L

        private var geocoderApi: YandexGeocoderApi? = null
        private val retrofit: Retrofit = YandexRestApi().buildRetrofit()

        fun getApi(): YandexGeocoderApi =
            geocoderApi ?: retrofit.create(YandexGeocoderApi::class.java)
    }
}