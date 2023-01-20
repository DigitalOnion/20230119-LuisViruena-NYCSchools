package com.outerspace.a20230119_luisviruena_nycschools.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.outerspace.a20230119_luisviruena_nycschools.MainFragmentDirections
import com.outerspace.a20230119_luisviruena_nycschools.R
import com.outerspace.a20230119_luisviruena_nycschools.content.ContentViewModel
import com.outerspace.a20230119_luisviruena_nycschools.databinding.MainHolderMainBinding

class MainRecyclerAdapter(private val viewModel: ContentViewModel):
    RecyclerView.Adapter<MainRecyclerAdapter.ViewHolder>() {
        class ViewHolder(binding: MainHolderMainBinding): RecyclerView.ViewHolder(binding.root) {
            var binding: MainHolderMainBinding
            init { this.binding = binding}
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<MainHolderMainBinding>(
            inflater, R.layout.main_holder_main, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataSet = viewModel.mutableMainListing.value!!
        val row = dataSet[position]
        holder.binding.textSchoolName.text = row.schoolName
        holder.binding.textAddress1.text = row.primaryAddressLine1
        holder.binding.textAddress2.text = "${row.city}, ${row.stateCode}. ${row.zip}"

        holder.binding.detailButton.setOnClickListener {
            run {
                val dbn = dataSet[position].dbn
                val action = MainFragmentDirections.actionMainFragmentToDetailFragment(dbn)
                holder.binding.root.findNavController().navigate(action)
            }
        }
    }

    override fun getItemCount(): Int {
        return viewModel.mutableMainListing.value!!.size
    }
}
