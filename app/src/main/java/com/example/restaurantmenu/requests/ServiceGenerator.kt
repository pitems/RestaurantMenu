package com.example.restaurantmenu.requests

import com.example.restaurantmenu.util.Constants
import retrofit2.converter.gson.GsonConverterFactory


import retrofit2.Retrofit
//This would be the schematics of a singleton retrofit object which will be on charge of handling all api calls with retrofit and the interface

object ServiceGenerator {
    //In kotlin we instantiate the class and the variable has the access to all variables and objects inside it
   // var constant = Constants()
    //Or call the variable directly
    private  val retrofitBuilder = Retrofit.Builder().baseUrl(Constants().base_Url).addConverterFactory(GsonConverterFactory.create())

    private  val retrofit = retrofitBuilder.build()

    private var recipeAPI = retrofit.create(RecipeApi::class.java)

    //The parentesis would be the data being sent to the function in case we need them
    fun getRecipeApi():RecipeApi {
        return  recipeAPI


    }

    fun <T>buildService(service:Class<T>):T{
        return retrofit.create(service)
    }


}