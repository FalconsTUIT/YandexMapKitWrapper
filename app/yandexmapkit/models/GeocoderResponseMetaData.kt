package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class GeocoderResponseMetaData(
    @SerializedName("request") val request: String = "",
    @SerializedName("found") val found: String = "",
    @SerializedName("Point") val point: Point = Point(),
    @SerializedName("results") val results: String = ""
)