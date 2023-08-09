package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var bien1: EditText
    private lateinit var bien2: EditText
    private lateinit var bienThem: Button
    private lateinit var bienTru: Button
    private lateinit var bienNhan: Button
    private lateinit var bienChia: Button
    private lateinit var bienKq: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bien1= findViewById(R.id.bien1)
        bien2 = findViewById(R.id.bien2)
        bienThem = findViewById(R.id.bienThem)
        bienTru = findViewById(R.id.bienTru)
        bienNhan = findViewById(R.id.bienNhan)
        bienChia = findViewById(R.id.bienChia)
        bienKq = findViewById(R.id.bienKq)

        bienThem.setOnClickListener {
           kq('+')
        }

        bienTru.setOnClickListener {
            kq('-')
        }

        bienNhan.setOnClickListener {
            kq('*')
        }

        bienChia.setOnClickListener {
            kq('/')
        }


    }
    private fun kq(operator: Char) {
        val sothunhat = bien1.text.toString().toDouble()
        val sothuhai = bien2.text.toString().toDouble()
        val result: Double

        when (operator) {
            '+' -> result = sothunhat + sothuhai
            '-' -> result = sothunhat - sothuhai
            '*' -> result = sothunhat * sothuhai
            '/' -> {
                if (sothuhai != 0.0) { //ko chia cho 0
                    result = sothunhat / sothuhai
                } else {
                    bienKq.text = "Không thể chia cho 0"
                    return
                }
            }
            else -> return
        }

       bienKq.text = "Kết quả: $result"
    }
}