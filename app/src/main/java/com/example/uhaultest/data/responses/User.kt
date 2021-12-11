package com.example.uhaultest.data.responses

import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("id")
    val id: Int,
    val name: String,
    val username: String,
    val email: String,
    val address: List<Address>,
    val phone: String,
    val website: String,
    val company: List<Company>
)