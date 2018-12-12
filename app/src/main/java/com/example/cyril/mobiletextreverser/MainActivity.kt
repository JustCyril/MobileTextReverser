package com.example.cyril.mobiletextreverser

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var enteredText : EditText? = null;
    var btnReverse : Button? = null;
    var mirroredText : TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enteredText = findViewById(R.id.entered_text)
        btnReverse = findViewById(R.id.btn_reverse)
        mirroredText = findViewById(R.id.mirrored_text)

        btnReverse?.setOnClickListener(View.OnClickListener { mirroredText?.setText(enteredText?.text.toString().reversed()) })

    }

}
