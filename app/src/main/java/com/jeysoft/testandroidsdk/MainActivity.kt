package com.jeysoft.testandroidsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jeysoft.my_test_sdk.ToastMessage

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastMessage.s(this, "Hello worlds")
    }
}