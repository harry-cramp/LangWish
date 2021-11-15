package com.anaglyph.langwish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loadDeckButton = findViewById<Button>(R.id.menu_button_load_decks)
        loadDeckButton.setOnClickListener {
            // activate deck loading activity
            startActivity(Intent(this, DeckMenu::class.java))
        }
    }
}