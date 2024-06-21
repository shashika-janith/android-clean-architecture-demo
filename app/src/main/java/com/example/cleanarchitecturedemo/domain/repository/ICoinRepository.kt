package com.example.cleanarchitecturedemo.domain.repository

import com.example.cleanarchitecturedemo.data.remote.dto.CoinDetailDto
import com.example.cleanarchitecturedemo.data.remote.dto.CoinDto

interface ICoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}