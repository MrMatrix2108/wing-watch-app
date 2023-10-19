package com.wingwatch.wingwatcher

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

var origin : String = "31.0377502,-29.8102634"
var destination : String = "31.0341148,-29.7968864"

object DirectionsClient {
    private val BASE_URL = "https://api.mapbox.com/directions/v5/"

    private val client = OkHttpClient()
        .newBuilder()
        .build()

     val retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun buildService(origin: String, destination: String): Retrofit {
        val coordinates = "$origin;$destination"
        return retrofit
    }
}