package jp.gr.java.conf.tmproject.data.source.local

import kotlinx.coroutines.flow.Flow

interface SampleLocalDataSource {
    val text: Flow<String>
    suspend fun updateText(text: String)
}
