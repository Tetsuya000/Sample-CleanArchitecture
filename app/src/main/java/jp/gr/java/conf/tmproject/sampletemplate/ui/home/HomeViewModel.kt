package jp.gr.java.conf.tmproject.sampletemplate.ui.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class HomeViewModel : ViewModel() {

    private val text: MutableStateFlow<String> = MutableStateFlow("Home")
}
