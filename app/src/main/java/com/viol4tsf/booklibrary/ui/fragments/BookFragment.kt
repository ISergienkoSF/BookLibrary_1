package com.viol4tsf.booklibrary.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.viol4tsf.booklibrary.R
import com.viol4tsf.booklibrary.ui.viewmodels.BookViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BookFragment: Fragment(R.layout.fragment_book) {

    private val viewModel: BookViewModel by viewModels()
}