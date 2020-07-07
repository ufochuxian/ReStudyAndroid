package com.eric.restudyandroid

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import java.util.logging.Logger

/**

 * @Author: chen

 * @datetime: 2020/5/8

 * @desc:

 */
class TestFragment : Fragment() {

    companion object {
        var instance = TestFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_main,null)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TestFragment"," [onDestroy]")
    }
}