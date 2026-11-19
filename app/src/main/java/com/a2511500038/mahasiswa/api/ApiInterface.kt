package com.a2511500038.mahasiswa.api

import com.a2511500038.mahasiswa.model.MahasiswaResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("mahasiswa.php")
    suspend fun getDaftarMahasiswa(): Response<MahasiswaResponse>
}