package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class Locality(
    @SerializedName("LocalityName") val localityName: String = "",
    @SerializedName("DependentLocality") val dependentLocality: DependentLocality? = null,
    @SerializedName("Premise") val premise: Premise? = null,
    @SerializedName("Thoroughfare") val thoroughfare: Thoroughfare? = null
)
