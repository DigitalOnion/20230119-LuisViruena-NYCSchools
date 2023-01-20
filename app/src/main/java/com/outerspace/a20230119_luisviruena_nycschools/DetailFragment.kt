package com.outerspace.a20230119_luisviruena_nycschools

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.outerspace.a20230119_luisviruena_nycschools.content.ContentApi
import com.outerspace.a20230119_luisviruena_nycschools.databinding.FragmentDetailBinding
import kotlinx.coroutines.launch

interface DetailInterface

class DetailFragment : DetailInterface, Fragment() {
    private val arguments: DetailFragmentArgs by navArgs()
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        binding.detailBinding = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            val dbn = arguments.dbn
            val schools = ContentApi.getSchools(dbn)
            val satScores = ContentApi.getSatScores(dbn)

            if (schools.isNotEmpty() && satScores.isNotEmpty()) {
                val school = schools[0]
                val scores = satScores[0]

                class RowClass (val name: String, val value: String)

                val rows = mutableListOf<RowClass>()

                rows += RowClass("DBM", school.dbn)
                rows += RowClass("School Name", school.schoolName)
                rows += RowClass("Address", school.primaryAddressLine1)
                rows += RowClass("", "${school.city}, ${school.stateCode}. ${school.zip}")
                rows += RowClass("Phone", school.phoneNumber)
                rows += RowClass("Web site", school.website)
                rows += RowClass("SAT Critical Reading", scores.satCriticalReadingAvgScore)
                rows += RowClass("SAT Mathematics", scores.satMathAvgScore)
                rows += RowClass("SAT Writing", scores.satWritingAvgScore)
                rows += RowClass("Overview", school.overviewParagraph)

                val insertPoint = binding.insertPoint

                for (row in rows) {
                    val v = layoutInflater.inflate(R.layout.row_detail, insertPoint, false)
                    val titleText = v.findViewById<TextView>(R.id.title)
                    val contentText = v.findViewById<TextView>(R.id.content)
                    titleText.text = row.name
                    contentText.text = row.value
                    insertPoint.addView(v)
                }
            }
        }

    }
}