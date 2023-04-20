package com.reachmobi.sportsdream.data

import com.squareup.moshi.Json

data class Player(
    @field:Json(name = "idPlayer")
    var idPlayer: String?,
    @field:Json(name = "strNationality")
    var strNationality: String?,
    @field:Json(name = "strPlayer")
    var strPlayer: String?,
    @field:Json(name = "strTeam")
    var strTeam: String?,
    @field:Json(name = "strTeam2")
    var strTeam2: String?,
    @field:Json(name = "strSport")
    var strSport: String?,
    @field:Json(name = "dateBorn")
    var dateBorn: String?,
    @field:Json(name = "strDescriptionEN")
    var strDescriptionEN: String?
)
