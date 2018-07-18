package practice.ncsoft.com.kotlinretrofit.data.source

import practice.ncsoft.com.kotlinretrofit.data.store.Repository

interface DataSource{
    interface SearchDataCallback{
        fun onSuccess(items: ArrayList<Repository>)
        fun onFailure(message: String)
    }

    fun searchData(callback: SearchDataCallback)
}