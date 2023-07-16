package com.berivan.homeworkthree

import Person
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.berivan.homeworkthree.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var desing: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        desing = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(desing.root)

        val dances = intent.getParcelableExtra("dances") as dances?


        with(desing) {
            textViewAdi.text = dances?.Person?.adisoyadi
            textViewcinsiyet.text = dances?.Person?.cinsiyet
            textViewemail.text = dances?.person?.email
            textViewsehir.text = dances?.person?.sehir
            textViewdans.text = dances?.person?.danstur
            textViewspor.text = dances?.person?.spor
            textViewkitap.text = dances?.person ?.kitap
            goster.setOnClickListener {
                val intent = Intent(this@MainActivity4, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)

            }
        }
        var backpressCount = 0;
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (backpressCount == 0) {
                    backpressCount++

                    Toast.makeText(
                        this@MainActivity4,
                            "Ana sayfaya dönmek için tekrar basın!",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    backpressCount = 0

                    val intent = Intent(this@MainActivity4, MainActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    startActivity(intent)
                }
            }

        })

    }
}
