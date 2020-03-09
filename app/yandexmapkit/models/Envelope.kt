package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class Envelope(
    @SerializedName("lowerCorner") val lowerCorner: String = "",
    @SerializedName("upperCorner") val upperCorner: String = ""
)