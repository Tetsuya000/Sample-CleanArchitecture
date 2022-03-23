package jp.gr.java.conf.tmproject.sampletemplate.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import jp.gr.java.conf.tmproject.sampletemplate.R
import jp.gr.java.conf.tmproject.sampletemplate.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentHomeBinding.bind(view)
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
