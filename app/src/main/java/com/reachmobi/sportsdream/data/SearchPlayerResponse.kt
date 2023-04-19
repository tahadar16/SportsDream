package com.reachmobi.sportsdream.data

import com.squareup.moshi.Json

data class SearchPlayerResponse(
    @Json(name = "player")
    var player: List<Player> = listOf()
)
