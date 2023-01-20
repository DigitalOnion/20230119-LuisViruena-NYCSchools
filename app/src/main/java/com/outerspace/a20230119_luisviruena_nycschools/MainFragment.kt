package com.outerspace.a20230119_luisviruena_nycschools

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.outerspace.a20230119_luisviruena_nycschools.content.ContentViewModel
import com.outerspace.a20230119_luisviruena_nycschools.databinding.FragmentMainBinding
import com.outerspace.a20230119_luisviruena_nycschools.view.MainRecyclerAdapter

interface MainInterface // {}

class MainFragment : MainInterface, Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_main, container, false)
        binding.mainBinding = this

        val viewModel: ContentViewModel by activityViewModels()
        viewModel.mutableMainListing.observe(viewLifecycleOwner) { run {
            binding.recycler.adapter = MainRecyclerAdapter(viewModel)
        }}

        return binding.root
    }

}