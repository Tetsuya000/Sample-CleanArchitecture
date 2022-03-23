package jp.gr.java.conf.tmproject.samplecleanarchitecture.presentation.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.repository.SampleRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val sampleRepository: SampleRepository
) : ViewModel() {

    private val text: MutableStateFlow<String> = MutableStateFlow("Home")

    val result: MutableStateFlow<String> = MutableStateFlow("Result")

    fun fetch() = viewModelScope.launch {
        val id = (1..3).random()
        val sample = sampleRepository.fetch(id)
        result.value = sample.text
    }
}
