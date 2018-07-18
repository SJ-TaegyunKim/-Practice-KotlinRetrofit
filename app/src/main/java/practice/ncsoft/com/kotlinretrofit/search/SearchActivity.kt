package practice.ncsoft.com.kotlinretrofit.search

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_search.*
import practice.ncsoft.com.kotlinretrofit.R
import practice.ncsoft.com.kotlinretrofit.util.*

import retrofit2.Retrofit

class SearchActivity : AppCompatActivity() {

    private lateinit var searchPresenter: SearchPresenter


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)


        // Set up RecycleView (Init)
        val searchFragment = supportFragmentManager.findFragmentById(R.id.rv_search)
                as SearchFragment? ?: SearchFragment.newInstance().also {
            replaceFragmentInActivity(it,R.id.rv_search)
        }

        //searchPresenter = SearchPresenter(Injection




    }
}
