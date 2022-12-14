package com.viol4tsf.booklibrary.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.viol4tsf.booklibrary.R
import kotlinx.android.synthetic.main.fragment_setup.*

class SetupFragment: Fragment(R.layout.fragment_setup) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        continueTextView.setOnClickListener {
            findNavController().navigate(R.id.action_setupFragment_to_bookListFragment)
        }
    }
}