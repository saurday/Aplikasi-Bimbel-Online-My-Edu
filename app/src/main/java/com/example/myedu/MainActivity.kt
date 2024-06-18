package com.example.myedu

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myedu.Kelas10
import com.example.myedu.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val kls10: CardView = findViewById(R.id.cv_kls10)
        val kls11: CardView = findViewById(R.id.cv_kls11)
        val kls12: CardView = findViewById(R.id.cv_kls12)
        val notes: CardView = findViewById(R.id.cv_notes)


        kls10.setOnClickListener {
            var pindah1 = Intent(this, Kelas10::class.java)
            startActivity(pindah1)
        }
        kls11.setOnClickListener {
            var pindah2 = Intent(this, Kelas10::class.java)
            startActivity(pindah2)
        }
        kls12.setOnClickListener {
            var pindah3 = Intent(this, Kelas10::class.java)
            startActivity(pindah3)
        }
        notes.setOnClickListener {
            var pindah4 = Intent(this, Kelas10::class.java)
            startActivity(pindah4)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}