package com.udacity.shoestore.ui.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.udacity.shoestore.databinding.WelcomeLayoutBinding

class WelcomeFragment : Fragment() {

    lateinit var binding: WelcomeLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = WelcomeLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }
}