package com.stevechulsdev.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.stevechulsdev.myapplication.extentions.setMyTextColor
import com.stevechulsdev.myapplication.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val tag: String = "stevechulsdev"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_convertTvColor.setOnClickListener { view ->

//            setTextColorBasic(view)

            setTextColorExtension(view)

        }
    }

    private fun setTextColorExtension(view: View) {

        Log.e(tag, "before: ${view.isSelected}")

        view.isSelected = !view.isSelected

        Log.e(tag, "after: ${view.isSelected}")

        if(view.isSelected)
        {
            textView1.setMyTextColor(R.color.colorSalmon)
            textView2.setMyTextColor(R.color.colorSalmon)
        }
        else
        {
            textView1.setMyTextColor(R.color.colorBlack)
            textView2.setMyTextColor(R.color.colorBlack)
        }
    }

    private fun setTextColorBasic(view: View) {

        val colorSalMon = "#fa8072"
        val colorBlack = "#000000"

        Log.e(tag, "before: ${view.isSelected}")

        view.isSelected = !view.isSelected

        Log.e(tag, "after: ${view.isSelected}")

        if(view.isSelected)
        {
            Utils.setMyTextColor(textView1, colorSalMon)
            Utils.setMyTextColor(textView2, colorSalMon)
        }
        else
        {
            Utils.setMyTextColor(textView1, colorBlack)
            Utils.setMyTextColor(textView2, colorBlack)
        }
    }
}
