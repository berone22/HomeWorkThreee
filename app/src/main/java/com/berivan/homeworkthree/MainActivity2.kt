package com.berivan.homeworkthree

import Person
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.berivan.homeworkthree.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var desing: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        desing = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(desing.root)


        val adisoyadi = intent.getStringExtra("adisoyadi")

        with(desing) {
            textViewgelen.text = adisoyadi.toString()
            btndevam.setOnClickListener {
                if (!editTextmail.text.isNotEmpty() && !editTextcinsiyet.text.isNotEmpty() && !editTextSehir.text.isNotEmpty()) {
                    val person = Person(
                        adisoyadi.toString(),
                        editTextSehir.toString(),
                        editTextmail.text.toString(),
                        editTextcinsiyet.text.toString()
                    )
                    val intent = Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtra("person", person)
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        this@MainActivity2,
                        "Lütfen Gerekli Alanları Doldurunuz",
                        Toast.LENGTH_SHORT
                    ).show()


                }


            }

        }

    }

}


