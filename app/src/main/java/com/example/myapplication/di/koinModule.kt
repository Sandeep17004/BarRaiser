package com.example.myapplication.di

import com.example.myapplication.Config
import com.example.myapplication.repository.ProductListRepository
import com.example.myapplication.repository.ProductListRepositoryImpl
import com.example.myapplication.viewModel.ProductListViewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// will contain all the different modules

val productListViewModelModule = module {
    single { ProductListViewModel(get()) }
}
val productListRepositoryModule = module {
    single<ProductListRepository> { ProductListRepositoryImpl(get()) }
}
val retrofitModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(Config.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}


val koinModule = listOf(
    productListViewModelModule,
    productListRepositoryModule,
    retrofitModule
)