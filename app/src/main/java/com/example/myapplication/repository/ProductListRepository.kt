package com.example.myapplication.repository

import com.example.myapplication.ProductListDataClass

interface ProductListRepository {
    suspend fun loadProductFromRepository(): BaseRepository<List<ProductListDataClass>>
}