package com.eightbitlab.shadowview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val renderScriptProvider = RenderScriptProvider(this)
//
//        cosmonaut.clipToOutline = true
//        space.clipToOutline = true
//        spaceShadow.blurScript = RenderScriptBlur(renderScriptProvider)
//        cosmonautShadow.blurScript = RenderScriptBlur(renderScriptProvider)

        cosmo2nautShadow.setOnClickListener {
            Log.d("2333333333", "gggggggg")
        }
    }
}
