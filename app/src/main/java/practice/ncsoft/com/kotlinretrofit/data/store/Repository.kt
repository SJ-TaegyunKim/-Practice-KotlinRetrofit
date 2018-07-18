package practice.ncsoft.com.kotlinretrofit.data.store

import com.google.gson.annotations.SerializedName
import practice.ncsoft.com.kotlinretrofit.data.source.remote.RemoteDataSource


class Repository {

    @SerializedName("URL")
    val id: String =""

    @SerializedName("text")
    val text: String = ""

    val a: RemoteDataSource
        get()= RemoteDataSource.instance!!
}