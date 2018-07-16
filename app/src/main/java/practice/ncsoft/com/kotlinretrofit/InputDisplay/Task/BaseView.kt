package practice.ncsoft.com.kotlinretrofit.InputDisplay.Task

interface BaseView<T> {
    fun setPresenter(presenter: T)
}