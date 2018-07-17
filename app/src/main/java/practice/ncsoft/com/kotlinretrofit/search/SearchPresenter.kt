package practice.ncsoft.com.kotlinretrofit.search

import android.support.design.widget.Snackbar
import android.view.View
import practice.ncsoft.com.kotlinretrofit.data.resData
import practice.ncsoft.com.kotlinretrofit.util.OkHttp3RetrofitManager
import practice.ncsoft.com.kotlinretrofit.util.RetrofitInterface
import retrofit2.Call
import okhttp3.Response
import retrofit2.Callback

class SearchPresenter  : SearchContract.Presenter{

    override fun start() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        network()
    }

    override fun network() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val restClient: RetrofitInterface =
                OkHttp3RetrofitManager.getRetrofitService(RetrofitInterface::class.java)

        val temp = restClient.requestSearch("temp","temp")
        temp.enqueue(object: Callback<resData>{
            override fun onResponse(call: Call<resData>?, response: retrofit2.Response<resData>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
            override fun onFailure(call: Call<resData>?, t: Throwable?) {
                error(message = t.toString())
            }
        })
    }
}