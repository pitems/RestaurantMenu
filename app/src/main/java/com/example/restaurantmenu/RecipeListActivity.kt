package com.example.restaurantmenu

import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_recipe_list.*

class RecipeListActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)
        btn_test.setOnClickListener {
            toggleProgress()
            Log.d("Button pressed", "onCreate: ")
        }

    }
    fun toggleProgress(){
        Log.d("Inside Toggle", "toggleProgress: ")
        if(progressbar.visibility== View.VISIBLE){
            showProgressBar(false)
            progressbar.visibility==View.INVISIBLE
        }else{
            showProgressBar(true)
            progressbar.visibility==View.VISIBLE
        }
    }


}