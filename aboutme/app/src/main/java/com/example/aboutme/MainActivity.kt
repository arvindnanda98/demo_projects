package com.example.aboutme

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
//import com.example.aboutme.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)
//        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

      val buttonPressed = findViewById<Button>(R.id.button)
      buttonPressed.setOnClickListener{
      somethingHappened(it)
        }

//        binding.button.setOnClickListener{
//            somethingHappened(it)
//        }

    }


    private fun somethingHappened(view:View) {
       val userName = findViewById<EditText>(R.id.usersName)
       val bio = findViewById<TextView>(R.id.bio)
       bio.text = userName.text

//        binding.bio.text = binding.usersName.text

    }
}



