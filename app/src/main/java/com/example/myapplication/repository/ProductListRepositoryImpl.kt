package com.example.myapplication.repository

import com.example.myapplication.ProductListDataClass
import com.example.myapplication.network.ApiInterface
import kotlinx.coroutines.CoroutineDispatcher

class ProductListRepositoryImpl(
    private val dispatcher: CoroutineDispatcher,
    private val apiInterface: ApiInterface
) : ProductListRepository,
    SafeApiCall() {
    override suspend fun loadProductFromRepository(): BaseRepository<List<ProductListDataClass>> {
        return makeSafeApiCall(dispatcher) {
            apiInterface.loadProductList()
        }

    }
}