package com.berivan.homeworkthree

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView.BufferType
import android.widget.Toast
import com.berivan.homeworkthree.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var desing: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        desing = ActivityMainBinding.inflate(layoutInflater)
        setContentView(desing.root)

        with(desing) {
            devambtn.setOnClickListener {
                val name = adisoyadi.text.toString()
                if (name.isNotEmpty()) {
                    val intent = Intent(this@MainActivity, MainActivity2::class.java)
                    intent.putExtra("adisoyadi", adisoyadi.text.toString())
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Lütfen Gerekli Alanları Doldurunuz",
                        Toast.LENGTH_SHORT
                    ).show()

                }

            }
        }
    }
}











