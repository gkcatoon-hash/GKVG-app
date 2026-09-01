package com.gkvg.calendar

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "GKVG Calendar"
        textView.textSize = 28f
        textView.setPadding(40, 80, 40, 80)

        setContentView(textView)
    }
}
