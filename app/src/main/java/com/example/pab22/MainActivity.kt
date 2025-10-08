package com.example.pab22

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inpnama = findViewById<EditText>(R.id.input_nama)
        val btnsbmt = findViewById<Button>(R.id.btn_submit)

        btnsbmt.setOnClickListener {
            val nama = inpnama.text.toString()
            if (nama.isEmpty()){
                Toast.makeText(this, "Nama belum diisi!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Halo, $nama!!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)

                }, 1000)
            }
        }
    }
}