package com.stevechulsdev.myapplication.extentions

import android.widget.Button
import android.widget.TextView

/**
 * 텍스트뷰의 글자 색을 변경해주는 Custom Extensions
 * @param color 변경하고자 하는 색상의 HEX 값
 */
fun TextView.setMyTextColor(color: Int) {
    this.setTextColor(color)
}

/**
 * 버튼의 글자를 변경해주는 Custom Extensions
 * @param changeText 변경하고자 하는 글자
 */
fun Button.changeText(changeText: String) {
    this.text = changeText
}