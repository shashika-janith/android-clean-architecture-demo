package com.example.cleanarchitecturedemo.presentation.coin_detail

import com.example.cleanarchitecturedemo.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
