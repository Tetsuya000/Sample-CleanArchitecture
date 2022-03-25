package jp.gr.java.conf.tmproject.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.gr.java.conf.tmproject.domain.usecase.GetTextUseCase
import jp.gr.java.conf.tmproject.domain.usecase.UpdateTextUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getTextUseCase: GetTextUseCase,
    private val updateTextUseCase: UpdateTextUseCase) : ViewModel() {

    val text: MutableStateFlow<String> = MutableStateFlow("")
    val editText: MutableStateFlow<String> = MutableStateFlow("")

    fun updateText() = viewModelScope.launch {
        if (editText.value.isBlank()) return@launch
        updateTextUseCase(editText.value)
    }

    private fun loadText() = viewModelScope.launch {
        getTextUseCase().collect {
            text.value = it
            editText.value = it
        }
    }

    init {
        loadText()
    }
}
