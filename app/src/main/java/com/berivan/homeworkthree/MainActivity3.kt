package com.berivan.homeworkthree

import android.app.Person
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.berivan.homeworkthree.databinding.ActivityMain3Binding


class MainActivity3 : AppCompatActivity() {
    private lateinit var desing: ActivityMain3Binding

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        desing = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(desing.root)
        val person = intent.getParcelableExtra("person") as Person?

        with(desing) {
            btndevam.setOnClickListener {
                val danstur = editTextTextdans.toString()
                val spor = editTextspor.toString()
                val kitap = editTextkitap.toString()


                if (danstur.isNotEmpty() && spor.isNotEmpty() && kitap.isNotEmpty() && person != null) {

                    val dance = dances(person, danstur,kitap, spor)
                    val intent = Intent(this@MainActivity3, MainActivity4::class.java)
                    intent.putExtra("person", person)
                    finish()
                    startActivity(intent)

                }

                else {
            Toast.makeText(
                this@MainActivity3,
                "Lütfen Gerekli Alanları Doldurunuz",
                Toast.LENGTH_SHORT
            ).show()


        }
}
}
    }
}
