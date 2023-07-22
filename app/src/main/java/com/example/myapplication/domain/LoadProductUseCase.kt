package com.example.myapplication.domain

import com.example.myapplication.repository.ProductListRepository

class LoadProductUseCase(
    val productListRepository: ProductListRepository,
    val dataBaseRepo
) {
    fun executeProductLoading() {

    }
}