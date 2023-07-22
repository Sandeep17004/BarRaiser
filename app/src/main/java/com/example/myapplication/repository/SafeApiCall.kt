package com.example.myapplication.repository

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

abstract class SafeApiCall {
    suspend inline fun <T> makeSafeApiCall(
        dispatcher: CoroutineDispatcher,
        crossinline apiCall: suspend () -> T
    ): BaseRepository<T> {
        return withContext(dispatcher) {
            try {
                BaseRepository.onSuccess(apiCall.invoke())
            } catch (throwable: Throwable) {
                processError(throwable)
            }
        }
    }

    fun <T> processError(throwable: Throwable): BaseRepository<T> {
        return BaseRepository.onError(throwable, null)

    }
}