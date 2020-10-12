package com.example.tokenbasedauthentication.data.network

import okhttp3.OkHttpClient

object ApiWorker{
    private var okHttpClient:OkHttpClient? = null
    val client:OkHttpClient
    get(){
        if(okHttpClient == null){
            val interceptor =
        }
        return okHttpClient
    }
}