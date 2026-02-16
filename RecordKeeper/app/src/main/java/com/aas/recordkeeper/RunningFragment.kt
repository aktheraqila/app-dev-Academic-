package com.aas.recordkeeper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aas.recordkeeper.databinding.FragmentRunningBinding

class RunningFragment : Fragment() {

    private lateinit var binding: FragmentRunningBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRunningBinding.inflate(inflater, container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpClickListeners()
    }

    private fun setUpClickListeners() {
        binding.container5km.setOnClickListener { launchRunningRecordScreen() }
        binding.container10km.setOnClickListener {  }
        binding.containerHalfMarathonTime.setOnClickListener {  }
        binding.containerMarathon.setOnClickListener {  }

    }

}

private fun RunningFragment.launchRunningRecordScreen() {
    TODO("Not yet implemented")
}
