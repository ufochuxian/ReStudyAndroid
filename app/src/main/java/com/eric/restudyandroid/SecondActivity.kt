package com.eric.restudyandroid

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.orhanobut.logger.Logger
import permissions.dispatcher.RuntimePermissions

/**

 * @Author: chen

 * @datetime: 2020/5/8

 * @desc:

 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        var fragment: TestFragment = TestFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container,TestFragment.instance)
        }

        Handler().postDelayed(Runnable {
            finish()
        },3000)
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.i("SecondActivity [onDestroy]")
        Logger.wtf("测试一下 what is this")

    }
}