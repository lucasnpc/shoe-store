package com.udacity.shoestore.util

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Fragment.setDisplayHomeAsUpEnabled(bool: Boolean) {
    if (activity is AppCompatActivity) {
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(
            bool
        )
    }
}