package jp.gr.java.conf.tmproject.sampletemplate.ui.notifications

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class NotificationsViewModel : ViewModel() {

    private val text: MutableStateFlow<String> = MutableStateFlow("Notifications")
}
