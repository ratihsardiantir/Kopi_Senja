package com.example.kopi_senja.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MenuItem(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "description") val description: String,
    @Json(name = "price") val price: Double,
    @Json(name = "image_url") val imageUrl: String,
    @Json(name = "category") val category: String,
    @Json(name = "sugar_levels") val sugarLevels: List<String>? = null,
    @Json(name = "ice_levels") val iceLevels: List<String>? = null
)
