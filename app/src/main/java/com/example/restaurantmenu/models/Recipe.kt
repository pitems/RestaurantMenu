package com.example.restaurantmenu.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
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
    var social_rank:Double?=null,
    @SerializedName("ingredients")
    var ingredients:List<String>
    ):Parcelable
{

   override fun toString():String{
      return "RecipeResponse{title=$title, publisher=$publisher, ingredients=${ingredients.toString()}, recipe_id= $recipe_id, image_url = $image_url, social_rank = $social_rank}}"
   }

}

