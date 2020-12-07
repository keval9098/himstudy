package com.example.himstudy.ui.currentAffairs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.himstudy.R

class CurrentAffairsFragment : Fragment() {

    private lateinit var currentAffairsViewModel: CurrentAffairsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        currentAffairsViewModel =
            ViewModelProviders.of(this).get(CurrentAffairsViewModel::class.java)
        val root = inflater.inflate(R.layout.current_affairs_fragment, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        currentAffairsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}