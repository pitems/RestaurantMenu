package com.example.restaurantmenu.models

import com.google.gson.annotations.SerializedName


data class Recipe (
    @SerializedName("title")
    var title:String? =null,
    @SerializedName("publisher")
    var publisher:String?=null,
    @SerializedName("recipe_id")
    var recipe_id:String?=null,
    @SerializedName("image_url")
    var image_url:String?=null,
    @SerializedName("social_rank")
    var social_rank:Double?=null

    )

