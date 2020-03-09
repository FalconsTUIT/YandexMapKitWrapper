package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("CountryName") val countryName: String = "",
    @SerializedName("AddressLine") val addressLine: String = "",
    @SerializedName("CountryNameCode") val countryNameCode: String = "",
    @SerializedName("AdministrativeArea") val administrativeArea: AdministrativeArea? = null,
    @SerializedName("Locality") val locality: Locality? = null
)