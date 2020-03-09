package com.mobilemedia.tanuki.yandexmapkit.api

import com.mobilemedia.tanuki.yandexmapkit.models.YaResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

internal interface YandexGeocoderApi {

    @GET("/1.x/?format=json")
    fun geocodeLocation(@Query("apikey") apiKey: String, @Query("geocode") location: String): Call<YaResponse>
}