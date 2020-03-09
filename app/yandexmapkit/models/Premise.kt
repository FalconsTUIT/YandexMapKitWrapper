package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class Premise(
    @SerializedName("PremiseNumber") val premiseNumber: String = "",
    @SerializedName("PremiseName") val premiseName: String = "",
    val postalCode: PostalCode? = null
)
