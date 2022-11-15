package com.xiang.mainproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xiang.commonutil.Util

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val util = Util()
        util.showLogUtil(this)
        util.showToast(this)
    }
}