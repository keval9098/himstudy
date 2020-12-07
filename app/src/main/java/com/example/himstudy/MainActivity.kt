package com.example.himstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Link the layout xml file activity_main


        button.setOnClickListener {

            CoroutineScope(IO).launch {
                fakeapirequest()
                setOnMainThread("Click me")
            }

        }

        //button2.setOnClickListener {
           // val msg : String = edittext.text.toString()  // to get text from text view having id edittext


            // This  block of code is used to make Intent used to navigate between activities

           // val intent = Intent(this, SecondActivity::class.java)
           // intent.putExtra("user_msg", msg)
           // startActivity(intent)
            // ####################################

        //}


    }
    private fun setNewText(input: String){
        val newText = textView2.text.toString() + "\n$input"
        textView2.text = newText
    }
    private suspend fun setOnMainThread(input:String){
        withContext (Main) {
            setNewText(input)
        }
    }

    private suspend fun fakeapirequest(){
        delay(10)
        getresult1()
        println("debug: result1 ")
    }

    private suspend fun getresult1():String{
        delay(10)
       return "result"

    }
}