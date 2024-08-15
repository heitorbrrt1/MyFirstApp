package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        val buttonForward = findViewById<ImageButton>(R.id.button_forward)
        buttonForward.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            // Crie um par de views compartilhadas para a transição
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                Pair.create(buttonForward, "slide_in")
            )

            startActivity(intent, options.toBundle())
        }
    }
}