package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollDice)
        rollButton.setOnClickListener{
            rollDice()
        }
    }


//    this function generates a random number and assigns an image to it
    private fun rollDice() {
        val randomNumber = Random().nextInt(6)+1
        val drawbale_dice = when(randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceImage: ImageView= findViewById(R.id.diceImage)
        diceImage.setImageResource(drawbale_dice)

    }
}