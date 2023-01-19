package com.outerspace.a20230119_luisviruena_nycschools.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
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
        holder.binding.textSchoolName.text = dataSet[position].schoolName
        holder.binding.detailButton.setOnClickListener {
            run {
//                val id = dataSet[position].itemId
//                val action = ListingFragmentDirections.actionOpenDetailFragment(id)
//                holder.binding.root.findNavController().navigate(action)
            }
        }
    }

    override fun getItemCount(): Int {
        return viewModel.mutableMainListing.value!!.size
    }
}
