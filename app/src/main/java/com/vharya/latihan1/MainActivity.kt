package com.vharya.latihan1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonSubmit = findViewById<Button>(R.id.button_ok)
        val resultView = findViewById<TextView>(R.id.display_result)

        buttonSubmit.setOnClickListener {
            val inputNrp = findViewById<EditText>(R.id.input_nrp)
            val inputName = findViewById<EditText>(R.id.input_name)
            val inputMajor = findViewById<EditText>(R.id.input_major)
            val inputEmail = findViewById<EditText>(R.id.input_email)
            val inputAddress = findViewById<EditText>(R.id.input_address)
            val inputGender = findViewById<EditText>(R.id.input_gender)

            var result = "";

            result += "NRP - ${inputNrp.text}\n"
            result += "Nama - ${inputName.text}\n"
            result += "Jurusan - ${inputMajor.text}\n"
            result += "Email - ${inputEmail.text}\n"
            result += "Alamat - ${inputAddress.text}\n"
            result += "Jenis Kelamin - ${inputGender.text}"

            resultView.text = result
        }
    }
}