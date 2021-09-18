package com.example.colormyviewsnewtry

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var boxOne: View
    private lateinit var boxTwo: View
    private lateinit var boxThree: View
    private lateinit var boxFour: View
    private lateinit var boxFive: View
    private lateinit var constraintLayout: ConstraintLayout

    private lateinit var redButton: Button
    private lateinit var yellowButton: Button
    private lateinit var greenButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boxOne = findViewById(R.id.box_one_text)
        boxTwo = findViewById(R.id.box_two_text)
        boxThree = findViewById(R.id.box_three_text)
        boxFour = findViewById(R.id.box_four_text)
        boxFive = findViewById(R.id.box_five_text)
        constraintLayout = findViewById(R.id.constraint_layout)

        redButton = findViewById(R.id.red_button)
        yellowButton = findViewById(R.id.yellow_button)
        greenButton = findViewById(R.id.green_button)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(boxOne, boxTwo, boxThree, boxFour, boxFive, constraintLayout,
            redButton, yellowButton, greenButton)

        for (item in clickableViews) {
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> boxThree.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFour.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}