package com.reachmobi.sportsdream.network

import com.reachmobi.sportsdream.data.SearchPlayerResponse
import retrofit2.Response

interface ApiHelper {
    suspend fun searchPlayer(
        searchText: String,
    ): Response<SearchPlayerResponse>
}