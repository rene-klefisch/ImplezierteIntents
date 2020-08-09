package de.sanexio.kotlin.impleziteintents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callBtn.setOnClickListener{
           val telNr = Uri.parse("tel:017765456486131515")
            val callIntent = Intent(Intent.ACTION_DIAL,telNr)
            startActivity(callIntent)
        }
        webBtn.setOnClickListener{
            val webUrl = Uri.parse("http://udemy.com")
            val webIntent = Intent(Intent.ACTION_VIEW,webUrl)
            startActivity(webIntent)
        }

    }
}
