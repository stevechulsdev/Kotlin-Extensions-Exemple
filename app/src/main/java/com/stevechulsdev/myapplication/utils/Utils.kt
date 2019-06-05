package com.stevechulsdev.myapplication.utils

import android.graphics.Color
import android.widget.Button
import android.widget.TextView

object Utils {

    fun setMyTextColor(textView: TextView, color: String) {
        textView.setTextColor(Color.parseColor(color))
    }

    fun setChangeButtonText(button: Button, changeText: String) {
        button.text = changeText
    }
}