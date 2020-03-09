package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class AdministrativeArea(
    @SerializedName("AdministrativeAreaName") val administrativeAreaName: String = "",
    @SerializedName("Locality") val locality: Locality? = null,
    @SerializedName("SubAdministrativeArea") val subAdministrativeArea: SubAdministrativeArea? = null
)