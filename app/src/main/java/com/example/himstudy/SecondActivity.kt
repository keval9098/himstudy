package com.example.himstudy

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

// This block is used to get the data from previous activity  using intent

        val bundle : Bundle? = intent.extras
        val msg = bundle!!.getString("user_msg")
        txv_user_msg.text=msg

        button3.setOnClickListener {
            val bundle : Bundle? = intent.extras
            val msg = bundle!!.getString("user_msg")


// This block is used to share data accross apps using intent
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, msg)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent, "Share to:"))
        }
        hobbybtn.setOnClickListener {
            val intent = Intent(this, HobbyActivity::class.java)
            startActivity(intent)
        }

    }


}