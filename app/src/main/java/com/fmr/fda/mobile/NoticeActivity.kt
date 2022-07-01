package com.fmr.fda.mobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fmr.fda.mobile.databinding.NoticeScreenBinding
import com.fmr.fda.mobile.util.isInternetConnected

class NoticeActivity : AppCompatActivity() {

    private lateinit var binding: NoticeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = NoticeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOk.setOnClickListener {
            val intent = if (isInternetConnected()) {
                Intent(this, LoginActivity::class.java)
            } else {
                Intent(this, NoNetworkActivity::class.java)
            }
            startActivity(intent)
            finish()
        }
    }
}