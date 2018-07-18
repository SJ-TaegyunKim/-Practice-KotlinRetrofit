package practice.ncsoft.com.kotlinretrofit.search

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.zip.Inflater

class SearchFragment : Fragment(), SearchContract.View{
    /*
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, saveInstanceState: Bundle?): View?{

    }
    */
    override fun setPresenter(presenter: SearchContract.Presenter){
        //구현 할 것
    }


    companion object {

        fun newInstance() = SearchFragment()
    }
}