package jp.gr.java.conf.tmproject.data.source.local

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class SampleLocalDataSourceImpl @Inject constructor(
    @ApplicationContext
    private val context: Context) : SampleLocalDataSource {

    companion object {
        private val Context.dataStore by preferencesDataStore("sample")
        private val textKey = stringPreferencesKey("text")
    }

    private val dataStore = context.dataStore

    override val text: Flow<String>
        get() = dataStore.data.map { it[textKey].orEmpty() }

    override suspend fun updateText(text: String) {
        dataStore.edit { it[textKey] = text }
    }
}
