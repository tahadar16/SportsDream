package com.reachmobi.sportsdream.network

sealed class ApiResult<out R> {
    data class Success<out R>(val result: R) : ApiResult<R>()
    data class Error(val errorMsg: String) : ApiResult<Nothing>()
    object Loading : ApiResult<Nothing>()
}
