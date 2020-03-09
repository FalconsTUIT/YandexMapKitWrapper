package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("Components") val components: List<ComponentsItem> = emptyList(),
    @SerializedName("country_code") val countryCode: String = "",
    @SerializedName("formatted") val formatted: String = "",
    val postalCode: String = ""
)
