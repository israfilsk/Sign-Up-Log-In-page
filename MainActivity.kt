package com.example.chatapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register_button.setOnClickListener {

            val email = email_register.text.toString()
            val password = password_register.text.toString()

            Log.d("MainActivity","Email is $email")
            Log.d("MainActivity","Password is $password")
        }


        already_account.setOnClickListener {

            Log.d("MainActivity","Try to show LogIn page")

            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }



    }
}
