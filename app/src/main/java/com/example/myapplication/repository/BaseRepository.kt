package com.example.myapplication.repository

data class BaseRepository<out T>(
    var networkStatus: NetworkStatus,
    val networkData: T?,
    val throwable: Throwable?
) {
    companion object {
        fun <T> onSuccess(data: T?): BaseRepository<T> {
            return BaseRepository(NetworkStatus.SUCCESS, data, null)
        }

        fun <T> onError(message: Throwable? = null, data: T? = null): BaseRepository<T> {
            return BaseRepository(NetworkStatus.FAILURE, data, message)
        }

        fun <T> onLoading(): BaseRepository<T> {
            return BaseRepository(NetworkStatus.LOADING, null, null)
        }
    }

}

enum class NetworkStatus {
    SUCCESS, FAILURE, LOADING
}