package com.example.restaurantmenu.requests.responses

import com.example.restaurantmenu.models.Recipe
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RecipeSearchResponse {
    @SerializedName("count")
    @Expose
    var count:String?=null
    var recipes:List<Recipe>?=null

}