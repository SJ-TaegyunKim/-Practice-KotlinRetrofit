package practice.ncsoft.com.kotlinretrofit.util

import practice.ncsoft.com.kotlinretrofit.data.resData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("https://openapi.naver.com/v1/")
    fun requestSearch(
            @Query("search") temp: String,
            @Query("항목2") temp2: String): Call<resData>
}