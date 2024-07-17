package com.masdika.masrusdiqr.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.masdika.masrusdiqr.R
import com.masdika.masrusdiqr.databinding.ActivityUserAuthBinding
import com.masdika.masrusdiqr.fragments.LoginFragment

class UserAuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityUserAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // USER AUTH CHECKING
        // TODO("check user auth when login is complete")

        // Replace to Login Fragment
        supportFragmentManager.beginTransaction().replace(R.id.user_auth_layout, LoginFragment()).commit()
    }
}