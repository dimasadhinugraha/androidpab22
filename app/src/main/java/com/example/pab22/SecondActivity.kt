package com.example.pab22

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley



class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txtResult = findViewById<TextView>(R.id.txtResult)
        val url = "https://jsonplaceholder.typicode.com/users"
        val queue = Volley.newRequestQueue(this)

        val request = StringRequest(Request.Method.GET, url, {
                response ->
            txtResult.text = response.substring(0, 100) + ".."
        },
        {
            error ->
            txtResult.text = "Gagal Memuat Data: ${error.message}"
        }
        )
        queue.add(request)

    }
}