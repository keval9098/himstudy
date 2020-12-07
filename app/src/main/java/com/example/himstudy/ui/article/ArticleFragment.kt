package com.example.himstudy.ui.article

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.himstudy.R

class ArticleFragment : Fragment() {

    private lateinit var articleViewModel: ArticleViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        articleViewModel =
            ViewModelProviders.of(this).get(ArticleViewModel::class.java)
        val root = inflater.inflate(R.layout.article_fragment, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        articleViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}