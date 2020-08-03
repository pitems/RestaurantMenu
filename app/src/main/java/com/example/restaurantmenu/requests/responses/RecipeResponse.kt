package com.example.restaurantmenu.requests.responses

import com.example.restaurantmenu.models.Recipe
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RecipeResponse {
    @SerializedName("recipe")
    @Expose()
    private var recipe:Recipe?=null

    fun getRecipe(): Recipe? {
        return recipe
    }


   override fun toString():String{
        return "RecipeResponse{recipe=${recipe.toString()}}"
    }

}