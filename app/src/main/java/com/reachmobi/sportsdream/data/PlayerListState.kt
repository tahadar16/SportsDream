package com.reachmobi.sportsdream.data

data class PlayerListState(
    var data : MutableList<Player>? = null,
    var isLoading: Boolean = false,
    var hasError : Boolean = false,
    var errorMsg : String? = null
)
