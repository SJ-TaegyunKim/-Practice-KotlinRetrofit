package practice.ncsoft.com.kotlinretrofit

interface BaseView<T> {
    fun setPresenter(presenter: T)
}