package com.example.midmorning_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class loginactivity : AppCompatActivity() {
    lateinit var texttoregister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)

        texttoregister=findViewById(R.id.Txt_reg)

        texttoregister.setOnClickListener {
            val mark=Intent(this,MainActivity::class.java)
            startActivity(mark)
        }

    }
}