package com.example.colorapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        val clickableViews: List<View> = listOf(
            findViewById(R.id.box1), findViewById(R.id.box2), findViewById(R.id.box3),
            findViewById(R.id.box4), findViewById(R.id.box5)
        )

        for (item in clickableViews) {
            item.setOnClickListener { view ->
                colorChanges(view)
            }
        }


    }

    private fun colorChanges(view: View) {
        when (view.id) {
            R.id.box1 -> {
                view.setBackgroundColor(Color.DKGRAY)
            }
            R.id.box2 -> {
                view.setBackgroundColor(Color.GRAY)
            }
            R.id.box3 -> {
                view.setBackgroundColor(Color.CYAN)
            }
            R.id.box4 -> {
                view.setBackgroundColor(Color.BLUE)
            }
            R.id.box5 -> {
                view.setBackgroundColor(Color.GREEN)
            }
        }
    }
}