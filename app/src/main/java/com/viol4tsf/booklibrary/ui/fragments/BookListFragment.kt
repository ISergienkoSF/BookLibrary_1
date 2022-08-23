package com.viol4tsf.booklibrary.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.viol4tsf.booklibrary.R
import com.viol4tsf.booklibrary.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_book_list.*

@AndroidEntryPoint
class BookListFragment: Fragment(R.layout.fragment_book_list) {

    private val viewModel: MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab.setOnClickListener {
            findNavController().navigate(R.id.action_bookListFragment_to_bookFragment)
        }
    }
}