package jp.gr.java.conf.tmproject.samplecleanarchitecture.data.source.local

import kotlinx.coroutines.flow.Flow

interface SampleLocalDataSource {
    val text: Flow<String>
    suspend fun updateText(text: String)
}
