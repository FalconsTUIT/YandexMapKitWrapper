package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class MetaDataProperty(
    @SerializedName("GeocoderMetaData") val geocoderMetaData: GeocoderMetaData? = null
)