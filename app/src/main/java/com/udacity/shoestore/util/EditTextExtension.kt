package com.udacity.shoestore.util

import android.content.Context
import android.widget.EditText
import android.widget.Toast

fun EditText.validateEmptyField(context: Context) {
    if (this.text.isEmpty()) {
        Toast.makeText(context, "This field cannot be empty", Toast.LENGTH_SHORT).show()
        this.error = "Fill the field"
        this.requestFocus()
    }
}