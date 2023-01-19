package com.outerspace.a20230119_luisviruena_nycschools.content

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://data.cityofnewyork.us/"
private const val API_KEY_ID = "eo4fr9ovq82ex5a5o1mbazb2w"
private const val API_KEY_SECRET = "3yw5h1bqj9p8v377s77tldrwjcta3aneevj2ggcpk5dc16n14f"
private const val APP_TOKEN = "uiN5nBJu9ZnJGN8xIpREF55k1"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .build()

interface ContentApiService {
    @GET("resource/s3k6-pzi2.json")
    suspend fun getMainListing(@Query("\$\$app_token") apiKey: String) : List<School>
}

object ContentApi {
    private val retrofitService: ContentApiService by lazy {
        retrofit.create(ContentApiService::class.java)
    }

    suspend fun getMainListing(): List<School> {
        return retrofitService.getMainListing(APP_TOKEN)
    }
}
