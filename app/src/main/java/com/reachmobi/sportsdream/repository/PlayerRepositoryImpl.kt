package com.reachmobi.sportsdream.repository

import android.util.Log
import com.reachmobi.sportsdream.network.ApiResult
import com.reachmobi.sportsdream.network.ApiService
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PlayerRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : PlayerRepository {
    override suspend fun searchPlayer(searchText: String) = flow {
        emit(ApiResult.Loading)
        val result = apiService.searchPlayers(searchText)
        Log.d("Usman", "searchPlayer: $searchText")
        if (result.isSuccessful) {
            val data = result.body()
            data?.let {
                it.player?.let {
                    emit(ApiResult.Success(data))
                    return@flow
                }
                emit(ApiResult.Error("No Players found"))
                return@flow
            }
            emit(ApiResult.Error("No players found"))
        } else {
            emit(ApiResult.Error("Something went wrong"))
        }
    }
}