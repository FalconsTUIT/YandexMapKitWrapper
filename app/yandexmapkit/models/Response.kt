package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("GeoObjectCollection") val geoObjectCollection: GeoObjectCollection? = null
)
