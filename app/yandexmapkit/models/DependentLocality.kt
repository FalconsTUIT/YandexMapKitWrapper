package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class DependentLocality(
    @SerializedName("DependentLocalityName") val dependentLocalityName: String = ""
)
