package jp.gr.java.conf.tmproject.samplecleanarchitecture.presentation.ui.dashboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import jp.gr.java.conf.tmproject.samplecleanarchitecture.R
import jp.gr.java.conf.tmproject.samplecleanarchitecture.databinding.FragmentDashboardBinding

@AndroidEntryPoint
class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!
    private val viewModel: DashboardViewModel by viewModels()

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentDashboardBinding.bind(view)
        binding.also {
            it.viewModel = viewModel
            it.lifecycleOwner = this
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}