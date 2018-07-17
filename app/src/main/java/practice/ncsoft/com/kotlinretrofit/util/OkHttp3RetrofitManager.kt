package practice.ncsoft.com.kotlinretrofit.util

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import java.util.concurrent.TimeUnit

object OkHttp3RetrofitManager {

    private val ALL_TIMEOUT = 10L
    private val API_KEY = "cTyQRkQhn0ePwOVl_B1p"
    private val API_HOST = ""

    private var okHttpClient: OkHttpClient
    private var retrofit: Retrofit

    init{
        // OkHttp3 연결과정
        val httpLogging = HttpLoggingInterceptor()
        httpLogging.level = HttpLoggingInterceptor.Level.BASIC

        okHttpClient = OkHttpClient().newBuilder().apply {
            addInterceptor (httpLogging)
            addInterceptor (HeaderSettingInterceptor())
            connectTimeout(ALL_TIMEOUT, TimeUnit.SECONDS)
            writeTimeout(ALL_TIMEOUT, TimeUnit.SECONDS)
            readTimeout(ALL_TIMEOUT, TimeUnit.SECONDS)
        }.build()

        retrofit = Retrofit.Builder().apply {
            baseUrl(API_HOST)
            client(okHttpClient)
            addConverterFactory(GsonConverterFactory.create())
        }.build()

    }

    private  class HeaderSettingInterceptor : Interceptor {

        @Throws(IOException::class)
        override fun intercept(chain: Interceptor.Chain): Response {

            val chainRequest = chain.request()

            val request = chainRequest.newBuilder().apply{
                addHeader("Accept", "application/json")
                addHeader("appKey", API_KEY)
            }.build()

            return chain.proceed(request)
        }
    }

    internal fun <T> getRetrofitService(restClass: Class<T>): T {
        return retrofit.create(restClass)
    }
}