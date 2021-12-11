package com.example.uhaultest.data.responses

import com.google.gson.annotations.SerializedName

data class Posts (

    @SerializedName("userId")
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String,

)