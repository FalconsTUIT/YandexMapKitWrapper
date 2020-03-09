package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class GeocoderMetaData(
    @SerializedName("Address") val address: Address? = null,
    @SerializedName("AddressDetails") val addressDetails: AddressDetails? = null,
    @SerializedName("kind") val kind: String = "",
    @SerializedName("precision") val precision: String = "",
    @SerializedName("text") val text: String = ""
)
