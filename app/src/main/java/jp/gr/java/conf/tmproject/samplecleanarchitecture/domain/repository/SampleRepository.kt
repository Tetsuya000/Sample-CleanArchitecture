package jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.repository

import jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.model.Sample

interface SampleRepository {
    suspend fun fetch(id: Int): Sample
}
