package com.example.himstudy.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.himstudy.MainActivity
import com.example.himstudy.MainActivity2
import com.example.himstudy.R
import com.example.himstudy.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.*


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {



        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.textView)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onStart() {
        super.onStart()
        CoroutineScope(Dispatchers.IO).launch {
            fakeapirequest()
            setOnMainThread("Click me")
        }
        clickme.setOnClickListener{
            Toast.makeText(activity, "this is lsdjf", Toast.LENGTH_SHORT).show()



        }
        movebtn.setOnClickListener {
            val myIntent = Intent(activity, MainActivity::class.java)
            startActivity(myIntent)
        }


    }
    private fun setNewText(input: String){
       // val newText = textView.text.toString() + "\n$input"
        textView.text = input
    }
    private suspend fun setOnMainThread(input:String){
        withContext (Dispatchers.Main) {
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
