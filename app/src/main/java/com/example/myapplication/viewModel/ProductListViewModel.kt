package com.example.myapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.ProductListDataClass
import com.example.myapplication.domain.LoadProductUseCase
import com.example.myapplication.repository.ProductListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent


// database repo
class ProductListViewModel(private val loadProductUseCase: LoadProductUseCase) : ViewModel(),
    KoinComponent {

    val productList = MutableLiveData<List<ProductListDataClass>>()
    fun loadProductList() {
        viewModelScope.launch(Dispatchers.IO) {

            productListRepository.loadProductFromRepository()
        }
    }

    fun getSortedItems(list: ArrayList<ProductListDataClass>): List<ProductListDataClass> {

// we have api service for  apple
        // fetch

    }
}

/*
onAttach()
onCreate()
onCreateView()
onActivityCreated()
onStart()
onResume()
onPause()
onStop()
onDestroyView()

onDestroy()
onDetach()*/
