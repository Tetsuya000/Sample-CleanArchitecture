package jp.gr.java.conf.tmproject.data.source.remote

import jp.gr.java.conf.tmproject.domain.model.Sample

interface SampleRemoteDataSource {
    suspend fun fetch(id: Int): Sample
}
