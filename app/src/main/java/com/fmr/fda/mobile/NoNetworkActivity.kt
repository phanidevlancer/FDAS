package com.fmr.fda.mobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fmr.fda.mobile.databinding.NoInternetBinding

class NoNetworkActivity : AppCompatActivity() {

    private lateinit var binding: NoInternetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = NoInternetBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}