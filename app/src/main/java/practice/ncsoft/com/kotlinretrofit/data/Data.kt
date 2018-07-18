package practice.ncsoft.com.kotlinretrofit.data

/**
 * Model class for a Task.
 *
 * @param title       title of the task
 * @param description description of the task
 * @param id          id of the task
 */

data class CurrentValue(val resData: resData)

class resData{
    var imgURL:ArrayList<ImgURL>? = null
    var explain: ArrayList<explain>? = null
}

data class ImgURL (val url: String)
data class explain (val explain: String)