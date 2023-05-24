package com.reachmobi.sportsdream.network

import com.reachmobi.sportsdream.data.SearchPlayerResponse
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(
    private val apiService: ApiService
) : ApiHelper {
    override suspend fun searchPlayer(searchText: String): Response<SearchPlayerResponse> {
        TODO("Not yet implemented")
    }
}