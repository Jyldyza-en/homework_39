package kg.tutorialapp.homework_39

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ScrollView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonScrollUp = findViewById<Button>(R.id.scroll_up)
        val buttonScrollDown = findViewById<Button>(R.id.scroll_down)
        val myScroll = findViewById<ScrollView>(R.id.scrollView)

        buttonScrollUp.setOnClickListener {
            myScroll.scrollBy(0, +20)
        }

        buttonScrollDown.setOnClickListener {
            myScroll.scrollBy(0,-20)
        }
    }
}