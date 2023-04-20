package com.reachmobi.sportsdream.repository

import com.reachmobi.sportsdream.data.SearchPlayerResponse
import com.reachmobi.sportsdream.network.ApiResult
import kotlinx.coroutines.flow.Flow

interface PlayerRepository {
    suspend fun searchPlayer(searchText: String): Flow<ApiResult<SearchPlayerResponse>>
}