package com.example.uhaultest.data.responses

data class Address (

    val street: String,
    val suite: String,
    val city: String,
    val zipcode: String,
    val geo: List<Geo>

    )