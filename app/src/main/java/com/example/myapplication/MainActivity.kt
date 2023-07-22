package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.MainActivityLayoutBinding
import com.example.myapplication.viewModel.ProductListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

//fetch productList and show
class MainActivity : AppCompatActivity() {

    private val productListViewModel: ProductListViewModel by viewModel()
    lateinit var screenBinding: MainActivityLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        screenBinding = MainActivityLayoutBinding.inflate(layoutInflater)
        loadProductList()
        observeViewModelObservables()

    }

    private fun observeViewModelObservables() {

    }

    private fun loadProductList() {
        productListViewModel.loadProductList()
    }

}