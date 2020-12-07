package com.example.himstudy.ui.has_mains

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.himstudy.R

class Has_MainsFragment : Fragment() {

    companion object {
        fun newInstance() = Has_MainsFragment()
    }

    private lateinit var viewModel: HasMainsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.has__mains_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HasMainsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}