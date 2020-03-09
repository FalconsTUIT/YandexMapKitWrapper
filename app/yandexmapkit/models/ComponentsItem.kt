package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class ComponentsItem(
    @SerializedName("kind") val kind: String = "",
    @SerializedName("name") val name: String = ""
)
