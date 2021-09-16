package uk.co.jakelee.localisationpoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.locale).text = "Locale: ${resources.configuration.locale}"
        findViewById<TextView>(R.id.websiteUrl).text = "URL: ${getString(R.string.websiteUrl)}"
    }
}