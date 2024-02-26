package com.yds.jokerapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yds.liblog.SLog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.logger).setOnClickListener {
            SLog.v("MainActivity", msg = "click logger button", true)
            SLog.startLoggerPage(this@MainActivity)
        }
    }
}