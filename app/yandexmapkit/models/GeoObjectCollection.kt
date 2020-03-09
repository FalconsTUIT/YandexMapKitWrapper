package com.mobilemedia.tanuki.yandexmapkit.models

import com.google.gson.annotations.SerializedName

data class GeoObjectCollection(
    @SerializedName("metaDataProperty") val metaDataProperty: MetaDataProperty? = null,
    @SerializedName("featureMember") val featureMember: List<FeatureMemberItem> = emptyList()
)