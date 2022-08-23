package com.viol4tsf.booklibrary.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.viol4tsf.booklibrary.R
import com.viol4tsf.booklibrary.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment: Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}