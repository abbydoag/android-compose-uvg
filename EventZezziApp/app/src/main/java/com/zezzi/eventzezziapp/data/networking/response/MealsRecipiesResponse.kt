package com.zezzi.eventzezziapp.data.networking.response

import com.google.gson.annotations.SerializedName

data class MealsRecipiesResponse(val recipies: List<RecipieResponse>)

data class RecipieResponse(
    @SerializedName("idRecipie") val id: String,
    @SerializedName("strRecipie") val name: String,
    @SerializedName("strRecipieDescription") val description: String,
    @SerializedName("strRecipieThumb") val imageUrl: String
)