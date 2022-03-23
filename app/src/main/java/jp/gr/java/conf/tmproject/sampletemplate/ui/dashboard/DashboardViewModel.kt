package jp.gr.java.conf.tmproject.sampletemplate.ui.dashboard

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class DashboardViewModel : ViewModel() {

    private val text: MutableStateFlow<String> = MutableStateFlow("Dashboard")
}
