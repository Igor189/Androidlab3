package com.example.lab3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val title = intent.getStringExtra("title")
        val artist = intent.getStringExtra("artist")
        val year = intent.getIntExtra("year", 0)
        val description = intent.getStringExtra("description") // получите новое свойство

        // Найдите TextViews и установите текст
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val artistTextView = findViewById<TextView>(R.id.artistTextView)
        val yearTextView = findViewById<TextView>(R.id.yearTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView) // новый TextView для описания

        titleTextView.text = title
        artistTextView.text = artist
        yearTextView.text = year.toString()
        descriptionTextView.text = description // установите текст для описания

        // добавьте обработчик для кнопки, который запускает неявный Intent
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=$title $artist"))
            startActivity(intent)
        }
    }
}