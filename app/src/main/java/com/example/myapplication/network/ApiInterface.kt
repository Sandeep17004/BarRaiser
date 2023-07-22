package com.example.myapplication.network

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET
    suspend fun loadProductList(@Query("product") productName: String)
}