package com.example.taras3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView2)
        var imageButton : ImageButton = findViewById(R.id.imageButton6)
        var editTextText: EditText = findViewById(R.id.editTextText)
        imageButton.setOnClickListener{
            if (editTextText.text.isEmpty()){
                textView.text = "Hello, friend!"
            }
            else{
                textView.text = "Hello, " + editTextText.text
            }
        }
    }
}