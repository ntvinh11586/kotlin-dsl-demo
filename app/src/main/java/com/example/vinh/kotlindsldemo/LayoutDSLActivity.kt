package com.example.vinh.kotlindsldemo

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

class LayoutDSLActivity : AppCompatActivity() {

    inline fun Context.linearLayout(block: LinearLayout.() -> Unit) =
        LinearLayout(this).apply(block)

    inline fun ViewGroup.view(block: View.() -> Unit) =
        View(context).apply(block)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = linearLayout {
            orientation = LinearLayout.HORIZONTAL
            addView(view {
                layoutParams.width = 100
                layoutParams.height = 40
            })
        }
    }
}