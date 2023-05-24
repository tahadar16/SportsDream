package com.reachmobi.sportsdream.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.reachmobi.sportsdream.data.PlayerListState
import com.reachmobi.sportsdream.network.ApiResult
import com.reachmobi.sportsdream.repository.PlayerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PlayerViewModel @Inject constructor(
    private val playerRepository: PlayerRepository
) : ViewModel() {

    private var _playerListState = mutableStateOf(PlayerListState())
    val playerListState: State<PlayerListState> = _playerListState

    fun searchPlayers(searchText: String) {
        viewModelScope.launch {
            playerRepository.searchPlayer(searchText).collect { response ->
                when (response) {
                    is ApiResult.Success -> _playerListState.value = PlayerListState(
                        response.result.player
                    )
                    is ApiResult.Error -> {
                        _playerListState.value = PlayerListState(
                            hasError = true,
                            errorMsg = response.errorMsg
                        )
                    }
                    is ApiResult.Loading -> _playerListState.value = PlayerListState(isLoading = true)
                }
            }
        }
    }
}