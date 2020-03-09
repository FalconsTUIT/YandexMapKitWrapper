package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class GeoObject(
    @SerializedName("metaDataProperty") val metaDataProperty: MetaDataProperty? = null,
    @SerializedName("boundedBy") val boundedBy: BoundedBy? = null,
    @SerializedName("name") val name: String = "",
    @SerializedName("Point") val point: Point? = null,
    @SerializedName("description") val description: String = ""
)
