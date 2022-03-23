package jp.gr.java.conf.tmproject.samplecleanarchitecture.data.repository

import jp.gr.java.conf.tmproject.samplecleanarchitecture.data.source.local.SampleLocalDataSource
import jp.gr.java.conf.tmproject.samplecleanarchitecture.data.source.remote.SampleRemoteDataSource
import jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.model.Sample
import jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.repository.SampleRepository
import javax.inject.Inject

class SampleRepositoryImpl @Inject constructor(
    private val sampleLocalDataSource: SampleLocalDataSource,
    private val sampleRemoteDataSource: SampleRemoteDataSource
) : SampleRepository {

    override suspend fun fetch(id: Int): Sample = sampleRemoteDataSource.fetch(id)
}
