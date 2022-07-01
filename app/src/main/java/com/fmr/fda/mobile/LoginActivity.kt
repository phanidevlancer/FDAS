package com.fmr.fda.mobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fmr.fda.mobile.databinding.LoginScreenBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.noAccountButton.setOnClickListener {
            val intent = Intent(this, NoticeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}