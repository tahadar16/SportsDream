package com.reachmobi.sportsdream.data

import com.squareup.moshi.Json

data class Player(
    @field:Json(name = "idPlayer")
    var idPlayer: String?,
    @field:Json(name = "idPlayer")
    var strNationality: String?,
    @field:Json(name = "idPlayer")
    var strPlayer: String?,
    @field:Json(name = "idPlayer")
    var strTeam: String?,
    @field:Json(name = "idPlayer")
    var strTeam2: String?,
    @field:Json(name = "idPlayer")
    var strSport: String?,
    @field:Json(name = "idPlayer")
    var dateBorn: String?,
    @field:Json(name = "idPlayer")
    var strDescriptionEN: String?
)
