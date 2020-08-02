package com.example.restaurantmenu

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import com.example.restaurantmenu.models.Recipe
import com.example.restaurantmenu.requests.RecipeApi
import com.example.restaurantmenu.requests.ServiceGenerator
import com.example.restaurantmenu.requests.responses.RecipeSearchResponse
import kotlinx.android.synthetic.main.activity_recipe_list.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecipeListActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)
        Log.d("Visibility", progressbar.isVisible.toString())
        btn_test.setOnClickListener {
           testRetrofitRequest()
        }

    }
    fun toggleProgress(){
        Log.d("Visibility", progressbar.isVisible.toString())
        if(progressbar.visibility== View.VISIBLE){
            showProgressBar(false)

        }else{
           showProgressBar(true)

        }

    }
    private fun testRetrofitRequest(){
        //This will set the recipeAPi
        val recipeApi = ServiceGenerator.getRecipeApi()
        //Setting up the search

       val request = ServiceGenerator.buildService(RecipeApi::class.java)
        val call = request.searchRecipe("chicken","1")
        call.enqueue(object : Callback<RecipeSearchResponse>{
            override fun onResponse(call: Call<RecipeSearchResponse>,
                response: Response<RecipeSearchResponse>
            ) {
                if(response.isSuccessful){
                    Log.d("Server Response", "onResponse: ${response.toString()}")

                }
                if(response.code()==200){
                    //WHAT the HELL happened here so we have a RecipeSearchResponse yes? well our recipe response has a list called recipes so we throw the response which is a list
                    //onto our list , how do we know that the response is a list, using postman we can see that we receive a json list called recipes
                    //the for loop allows us to go into the list and with the model for recipe which has all elements inside the list we can call
                    //independently each element inside in 1 go making it easier to get the data inside like for example titles
                    Log.d("Server Response Body", "onResponse: ${response.body()!!.recipes}")
                    val recipes = response.body()!!.recipes
                    if (recipes != null) {
                        for (recipe in recipes )
                        {
                            println("Recipe ${recipe.title}")
                        }

                    }
                }

            }

            override fun onFailure(call: Call<RecipeSearchResponse>, t: Throwable) {

            }

        })


    }
    //Just an idea but in this base activity we can add our firebase code so it check out on every other bloody activity
    //whether we got a notification or not, also it can help to manipulate more easily some data and reuse code


}