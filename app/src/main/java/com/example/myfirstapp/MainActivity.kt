package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import android.widget.ImageButton
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button12 = findViewById<Button>(R.id.button11)
        button12.backgroundTintList = getColorStateList(R.color.colorPrimaryMonochromatic1)
        button12.setTextColor(getColor(R.color.white))

        val button11 = findViewById<Button>(R.id.button12)
        button11.backgroundTintList = getColorStateList(R.color.colorAccentMonochromatic1)
        button11.setTextColor(getColor(R.color.white))

        val buttonForward = findViewById<ImageButton>(R.id.button_forward)

        buttonForward.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            // Crie um par de views compartilhadas para a transição
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                Pair.create(buttonForward, "slide_in")
            )

            startActivity(intent, options.toBundle())
        }
    }

}
