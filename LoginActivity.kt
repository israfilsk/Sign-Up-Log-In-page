package com.example.chatapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        login_button.setOnClickListener {

            val username = login_username.text.toString()
            val password = login_password.text.toString()

            Log.d("MainActivity","user name is $username")
            Log.d("MainActivity","passsword is $password")
        }

        not_have_account.setOnClickListener {

            finish()
        }
    }
}
