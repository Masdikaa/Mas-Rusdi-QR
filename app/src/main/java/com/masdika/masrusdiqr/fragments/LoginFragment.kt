package com.masdika.masrusdiqr.fragments

import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.masdika.masrusdiqr.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

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

}