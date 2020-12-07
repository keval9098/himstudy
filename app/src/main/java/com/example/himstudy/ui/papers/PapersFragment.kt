package com.example.himstudy.ui.papers

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.himstudy.R

class PapersFragment : Fragment() {

    companion object {
        fun newInstance() = PapersFragment()
    }

    private lateinit var viewModel: PapersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.papers_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PapersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}