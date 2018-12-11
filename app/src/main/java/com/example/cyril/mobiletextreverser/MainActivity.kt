package com.example.cyril.mobiletextreverser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View; // подключаем класс View для обработки нажатия кнопки
import android.widget.Button
import android.widget.EditText; // подключаем класс EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

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

        btnReverse?.setOnClickListener(View.OnClickListener { DoReverse() })

    }


    public fun DoReverse() {
        var enteredMessage = enteredText?.text.toString()
        val cycleDuration = (enteredMessage.length/2 - enteredMessage.length%2).toInt()

        for (i in 0..cycleDuration-1) {
            enteredMessage.replace(enteredMessage[i], enteredMessage[enteredMessage.lastIndex-i])
        }

        mirroredText?.setText(enteredMessage)
    }
}
