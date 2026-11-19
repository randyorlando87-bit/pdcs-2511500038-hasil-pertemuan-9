package com.a2511500038.mahasiswa.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiConfig {
    // BASE_URL sesuaikan dengan server masing-masing.
    // Contoh: server laptop di http://localhost:8080/pertemuan_6/api/
    // maka untuk emulator gunakan http://10.0.2.2:8080/pertemuan_6/api/
    private const val BASE_URL = "http://10.0.2.2/2511500038_pdcs/Pertemuan6/api/"

    fun getApiService(): ApiInterface {
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

        return retrofit.create(ApiInterface::class.java)
    }
}