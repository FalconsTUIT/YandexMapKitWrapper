package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class Point(
    @SerializedName("pos") val pos: String = ""
)
