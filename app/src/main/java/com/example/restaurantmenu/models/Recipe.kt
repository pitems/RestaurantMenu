package com.example.restaurantmenu.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Recipe (
    @Json(name="title")
    val title:String,
    val publisher:String,
    val recipe_id:String,
    val image_url:String,
    val social_rank:Double

    )