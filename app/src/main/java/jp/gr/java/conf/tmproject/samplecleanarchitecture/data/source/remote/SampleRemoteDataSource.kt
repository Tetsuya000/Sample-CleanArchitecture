package jp.gr.java.conf.tmproject.samplecleanarchitecture.data.source.remote

import jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.model.Sample

interface SampleRemoteDataSource {
    suspend fun fetch(id: Int): Sample
}
