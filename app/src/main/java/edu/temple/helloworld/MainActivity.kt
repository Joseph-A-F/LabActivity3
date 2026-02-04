package edu.temple.helloworld

import android.app.Notification
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var textbox: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        textbox = findViewById<EditText>(R.id.nameEditText)
        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            if (textbox.text.length > 0){
                displayTextView.text = "Hello, ${textbox.text}"
            }else{
                displayTextView.text = "Please write your name in the textbox."
            }
        }


    }
}