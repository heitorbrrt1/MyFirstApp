package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import android.widget.ImageButton
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val buttonForward = findViewById<ImageButton>(R.id.button_forward)
        buttonForward.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)

            // Crie um par de views compartilhadas para a transição
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                Pair.create(buttonForward, "slide_in")
            )

            startActivity(intent, options.toBundle())
        }

        val buttonPrevious = findViewById<ImageButton>(R.id.button_previous)
        buttonPrevious.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            // Crie um par de views compartilhadas para a transição
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                Pair.create(buttonPrevious, "slide_in")
            )

            startActivity(intent, options.toBundle())
        }

    }
}