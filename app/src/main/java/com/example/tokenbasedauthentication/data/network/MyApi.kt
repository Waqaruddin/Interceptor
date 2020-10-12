package com.example.tokenbasedauthentication.data.network

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface MyApi {

    companion object{
        operator fun invoke(): MyApi{
            return Retrofit.Builder()
                .baseUrl("")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client()
                .build()
                .create(MyApi::class.java)
        }
    }
}