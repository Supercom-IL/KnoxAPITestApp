package com.supercom.knoxapitestapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        val packageInfo = packageManager.getPackageInfo(packageName, 0)
        val versionCode = packageInfo.versionCode
        val versionName = packageInfo.versionName

        findViewById<TextView>(R.id.tv_text).text = "Version code:$versionCode\nVersion name:$versionName"
    }
}