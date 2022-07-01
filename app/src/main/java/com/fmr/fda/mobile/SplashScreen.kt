package com.fmr.fda.mobile

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.fmr.fda.mobile.databinding.SplashScreenBinding

class SplashScreen : AppCompatActivity() {

    private lateinit var binding: SplashScreenBinding
    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startLogin()
    }

    private fun startLogin() {
        mHandler = Handler(Looper.getMainLooper())
        mRunnable = Runnable {
            val intent = Intent(this, NoticeActivity::class.java)
            startActivity(intent)
            finish()
        }
        mHandler.postDelayed(mRunnable, 3000)
    }
}