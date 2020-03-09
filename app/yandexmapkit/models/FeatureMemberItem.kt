package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class FeatureMemberItem(
    @SerializedName("GeoObject") val geoObject: GeoObject? = null
)
