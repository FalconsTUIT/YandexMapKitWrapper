package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class AddressDetails(
    @SerializedName("Country") val country: Country? = null
)
