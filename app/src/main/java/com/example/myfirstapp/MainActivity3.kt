package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val button31 = findViewById<Button>(R.id.button31)
        button31.backgroundTintList = getColorStateList(R.color.colorPrimaryDarkQuadratic)
        button31.setTextColor(getColor(R.color.white))

        val button32 = findViewById<Button>(R.id.button32)
        button32.backgroundTintList = getColorStateList(R.color.colorPrimaryQuadratic)
        button32.setTextColor(getColor(R.color.white))


        val buttonForward = findViewById<ImageButton>(R.id.button_forward)
        buttonForward.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)

            // Crie um par de views compartilhadas para a transição
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                Pair.create(buttonForward, "slide_in")
            )

            startActivity(intent, options.toBundle())
        }
        val buttonPrevious = findViewById<ImageButton>(R.id.button_previous)
        buttonPrevious.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            // Crie um par de views compartilhadas para a transição
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                Pair.create(buttonPrevious, "slide_in")
            )

            startActivity(intent, options.toBundle())
        }
    }
}