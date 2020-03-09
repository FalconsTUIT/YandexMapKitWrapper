package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class Thoroughfare(
    @SerializedName("ThoroughfareName") val thoroughfareName: String = "",
    @SerializedName("Premise") val premise: Premise? = null
)
