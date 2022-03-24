package jp.gr.java.conf.tmproject.samplecleanarchitecture.data.repository

import jp.gr.java.conf.tmproject.samplecleanarchitecture.data.source.local.SampleLocalDataSource
import jp.gr.java.conf.tmproject.samplecleanarchitecture.data.source.remote.SampleRemoteDataSource
import jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.repository.SampleRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SampleRepositoryImpl @Inject constructor(
    private val sampleLocalDataSource: SampleLocalDataSource,
    private val sampleRemoteDataSource: SampleRemoteDataSource
) : SampleRepository {

    override val text: Flow<String> = sampleLocalDataSource.text

    override suspend fun updateText(text: String) {
        sampleLocalDataSource.updateText(text)
    }
}
