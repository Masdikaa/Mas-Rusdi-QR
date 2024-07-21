package com.masdika.masrusdiqr.fragments

import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.masdika.masrusdiqr.StringEncrypt
import com.masdika.masrusdiqr.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val encryptPassword = StringEncrypt()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        val textSignUp = "Sign Up"
        val spannableString = SpannableString(textSignUp)
        spannableString.setSpan(UnderlineSpan(), 0, textSignUp.length, 0)
        binding.signUpButton.text = spannableString

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener {
            val username = binding.inputUsername.text.toString()
            val password = binding.inputPassword.text.toString()
            val passwordHash = encryptPassword.encrypt(password)

//            if (username.isEmpty()) {
//                binding.inputUsername.error = "Enter your username"
//                binding.inputUsername.requestFocus()
//            } else if (password.isEmpty()) {
//                binding.inputUsername.error = "Password must not be empty"
//                binding.inputUsername.requestFocus()
//            } else if (password.length < 8) {
//                binding.inputUsername.error = "Password must not be less than 8 characters"
//                binding.inputUsername.requestFocus()
//            }

            Log.d("Password Hash", passwordHash)
            Log.d("Password", password)
        }
    }

}