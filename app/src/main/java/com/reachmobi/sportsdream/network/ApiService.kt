package com.reachmobi.sportsdream.network

import com.reachmobi.sportsdream.data.SearchPlayerResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/searchplayers.php")
    suspend fun searchPlayers(@Query("p") searchText: String): Response<SearchPlayerResponse>
}