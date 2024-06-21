package com.example.cleanarchitecturedemo.presentation.coin_list

import com.example.cleanarchitecturedemo.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
