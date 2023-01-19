package com.outerspace.a20230119_luisviruena_nycschools.content
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ContentViewModel: ViewModel() {
    val mutableMainListing: MutableLiveData<List<School>> by lazy {
        MutableLiveData<List<School>>()
    }
}