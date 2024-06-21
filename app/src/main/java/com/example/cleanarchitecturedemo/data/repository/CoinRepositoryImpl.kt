package com.example.cleanarchitecturedemo.data.repository

import com.example.cleanarchitecturedemo.data.remote.ICoinPaprikaApi
import com.example.cleanarchitecturedemo.data.remote.dto.CoinDetailDto
import com.example.cleanarchitecturedemo.data.remote.dto.CoinDto
import com.example.cleanarchitecturedemo.domain.repository.ICoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api: ICoinPaprikaApi) : ICoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}