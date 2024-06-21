package com.example.cleanarchitecturedemo.data.remote

import com.example.cleanarchitecturedemo.data.remote.dto.CoinDetailDto
import com.example.cleanarchitecturedemo.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ICoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}