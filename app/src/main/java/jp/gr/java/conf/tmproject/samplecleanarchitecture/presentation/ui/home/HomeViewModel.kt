package jp.gr.java.conf.tmproject.samplecleanarchitecture.presentation.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.usecase.GetTextUseCase
import jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.usecase.UpdateTextUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getTextUseCase: GetTextUseCase,
    private val updateTextUseCase: UpdateTextUseCase
) : ViewModel() {

    val textResource: StateFlow<String?> = getTextUseCase().stateIn(viewModelScope, SharingStarted.Eagerly, null)
    val editText: MutableStateFlow<String?> = MutableStateFlow(textResource.value)

    fun updateText() = viewModelScope.launch {
        updateTextUseCase(editText.value ?: return@launch)
    }

    private fun loadText() = viewModelScope.launch {
        getTextUseCase().collect {
            editText.value = it
        }
    }

    init {
        loadText()
    }
}
