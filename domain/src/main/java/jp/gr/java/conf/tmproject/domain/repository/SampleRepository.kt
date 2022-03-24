package jp.gr.java.conf.tmproject.domain.repository

import kotlinx.coroutines.flow.Flow

interface SampleRepository {
    val text: Flow<String>
    suspend fun updateText(text: String)
}
