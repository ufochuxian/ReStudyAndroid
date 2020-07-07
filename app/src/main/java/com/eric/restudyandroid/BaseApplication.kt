package com.eric.restudyandroid

import android.Manifest
import android.app.Application
import com.orhanobut.logger.*
import permissions.dispatcher.NeedsPermission
import permissions.dispatcher.RuntimePermissions


/**
 * @Author: chen
 * @datetime: 2020/5/12
 * @desc:
 */
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}