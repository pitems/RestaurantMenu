package com.example.restaurantmenu.requests

import com.example.restaurantmenu.models.Recipe
import com.example.restaurantmenu.requests.responses.RecipeSearchResponse
import com.example.restaurantmenu.util.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

val URL = Constants().base_Url
interface RecipeApi {
    //The value of get is not the base url is the direction of the API it needs it to now where to get the data from
    @GET("/api/search")
    fun searchRecipe(
        @Query("q") q:String,//Will Append a ?
        @Query("page") page:String // Will Append an &
    ):Call<RecipeSearchResponse>

    //Recipe Request
    @GET("/api/get")
    fun getrecipe(
        @Query("rId") rId:String
    ):Call<Recipe>

}