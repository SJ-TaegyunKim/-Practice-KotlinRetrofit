package practice.ncsoft.com.kotlinretrofit.util

import android.support.annotation.NonNull
import android.support.v4.util.Pair
import com.google.gson.JsonArray
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.math.roundToInt

class Network {
    val restClient: RetrofitInterface =
            OkHttp3RetrofitManager.getRetrofitService(RetrofitInterface::class.java)

    val temp = restClient.requestSearch("asd","asd")


}
/*
private fun setUICurrentWeather(data: CurrentWeather?) {

    val minutely: Minutely? = data?.weather?.minutely?.get(0)

    /*
     * 현재날씨및 오늘의 최저/최고 온도를 가져온다
     */
    minutely?.let {
        tvTodayCurrentTemperature.text = it.temperature.tc.toDouble().roundToInt().toString()
        maxTv.text = it.temperature.tmax.toDouble().roundToInt().toString()
        minTv.text = it.temperature.tmin.toDouble().roundToInt().toString()

        /*
         * 현재 하늘상태(sky code)맞는 Icon으로
         * Background Image및 Weather Icon 을 세팅한다
         */
        val pair: Pair<Int, Int> = WeatherUtil.currentABGIconCondition(it.sky.code)
        mainRootview.setBackgroundResource(pair.first!!)
        ivCurrentWeatherIcon.setImageResource(pair.second!!)
    }
}
*/

/*
    public class Contributor{
        var login: String = ""
        var html_url: String = ""

        var contribution: Int = 0

        @Override
        override fun toString(): String = login + " (" + contribution + ")";
    }
 */