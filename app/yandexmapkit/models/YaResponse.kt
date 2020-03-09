package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class YaResponse(
    @SerializedName("response") val response: Response? = null
)
