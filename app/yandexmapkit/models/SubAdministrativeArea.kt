package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class SubAdministrativeArea(
    @SerializedName("Locality") val locality: Locality? = null,
    @SerializedName("SubAdministrativeAreaName") val subAdministrativeAreaName: String = ""
)
