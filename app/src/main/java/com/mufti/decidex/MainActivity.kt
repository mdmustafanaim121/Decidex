package com.mufti.decidex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array = ArrayList<String>();

        addButton.setOnClickListener() {
            val item = textValue.text.toString()
            array.add(item)
        }

        decide.setOnClickListener(){
            val random = Random()
            val randomItem = random.nextInt(array.count())
            textDisplay.text = array[randomItem]
        }
    }
}
