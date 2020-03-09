package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class BoundedBy(
    @SerializedName("Envelope") val envelope: Envelope? = null
)
