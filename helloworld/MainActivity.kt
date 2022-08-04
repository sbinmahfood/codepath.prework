package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text
import com.example.helloworld.R.id.button
import android.widget.Button


// This Kotlin file is where we are going yo be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)
    }
        // User can tap a button to change the text color of the label.
        // 1. Add a button to our layout

        // Get a reference to button
        // 2. Set up logic to know when user has tapped on button
         findViewById<Button>{button).setOnClickListener {
            // Handle button tap
            // 2. Change the color of the text
            Log.i("Caren", "Tapped on button")
            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().R.color.white))

        }
    }
}