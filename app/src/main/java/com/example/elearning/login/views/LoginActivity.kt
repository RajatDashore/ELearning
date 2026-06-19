package com.example.elearning.login.views

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import com.example.elearning.databinding.ActivityLoginBinding
import com.example.elearning.recycle.views.MainActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val gmail = binding.edtGmail.text.toString().trim()
            if (!Patterns.EMAIL_ADDRESS.matcher(gmail).matches()) {
                binding.edtGmail.setError("Please enter valid gmail")
                return@setOnClickListener
            }

            if (binding.edtpass.text.toString().trim().length < 1) {
                binding.edtpass.setError("Please enter password")
                return@setOnClickListener
            }

            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            //finish()
        }

    }
}