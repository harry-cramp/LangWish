package com.anaglyph.langwish

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DeckMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_decks)

        val createDeckButton = findViewById<Button>(R.id.deck_loader_button_create_deck)
        createDeckButton.setOnClickListener {
            CreateDeckFragment().show(supportFragmentManager, "Create Deck Dialog")
        }
    }
}