package com.example.restaurantmenu

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_recipe_list.*

class RecipeListActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)
        Log.d("Visibility", progressbar.isVisible.toString())
        btn_test.setOnClickListener {
            toggleProgress()
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

    //Just an idea but in this base activity we can add our firebase code so it check out on every other bloody activity
    //whether we got a notification or not, also it can help to manipulate more easily some data and reuse code


}