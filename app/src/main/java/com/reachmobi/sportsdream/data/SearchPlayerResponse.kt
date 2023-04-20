package com.reachmobi.sportsdream.data

import com.squareup.moshi.Json

data class SearchPlayerResponse(
    @field:Json(name = "player")
    var player: MutableList<Player>? = mutableListOf()
)
