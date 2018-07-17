package practice.ncsoft.com.kotlinretrofit.data

data class CurrentValue(val resData: resData)

class resData{
    var imgURL:ArrayList<ImgURL>? = null
    var explain: ArrayList<explain>? = null
}

data class ImgURL (val url: String)
data class explain (val explain: String)