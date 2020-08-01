package com.example.restaurantmenu

import android.util.Log
import android.view.View
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_base.*

public abstract class BaseActivity : AppCompatActivity(){
    //Abstract class cannot be instantiated like a normal class it can only be used to extend to another class

    public lateinit var progressbar:ProgressBar

    override fun setContentView(layoutResID: Int) {

        val constraintLayout = layoutInflater.inflate(R.layout.activity_base,null)
        val frameLayout:FrameLayout = constraintLayout.findViewById(R.id.activity_content)
        progressbar= constraintLayout.findViewById(R.id.progress_bar)

        layoutInflater.inflate(layoutResID,frameLayout,true)
        //Remember to add the constraintlayout(Our Actual Bloody View) into the set content view or it wont work
        super.setContentView(constraintLayout)
    }

    fun showProgressBar(visibility:Boolean){
        //visibility is to set the visibility of the object
        //is visible is to check whether the object is visible or not
        if (visibility) {
            progressbar.visibility=View.VISIBLE
        }else{
            progressbar.visibility=View.INVISIBLE
        }

    }

}