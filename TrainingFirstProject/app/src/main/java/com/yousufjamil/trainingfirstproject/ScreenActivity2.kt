package com.yousufjamil.trainingfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ScreenActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
    }
    fun goBack(view: View) {
        val backIntent = Intent(this,MainActivity::class.java)
        startActivity(backIntent)
    }
}