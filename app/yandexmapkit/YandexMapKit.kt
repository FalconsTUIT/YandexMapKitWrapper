package com.mobilemedia.tanuki.yandexmapkit

import com.mobilemedia.tanuki.yandexmapkit.api.YandexRestApi
import com.mobilemedia.tanuki.yandexmapkit.models.Point
import com.mobilemedia.tanuki.yandexmapkit.models.YaResponse
import retrofit2.Call

class YandexMapKit(private val apiKey: String) {

    private val api = YandexRestApi.getApi()

    fun geocodeLocation(latitude: Double, longitude: Double): Call<YaResponse> {
        val point = Point("$latitude, $longitude")
        return api.geocodeLocation(apiKey, point.pos)
    }

    fun geocodeLocation(location: String): Call<YaResponse> {
        return api.geocodeLocation(apiKey, location)
    }
}