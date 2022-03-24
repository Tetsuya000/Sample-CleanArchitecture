package jp.gr.java.conf.tmproject.data.source.remote

import jp.gr.java.conf.tmproject.domain.model.Sample
import kotlinx.coroutines.delay
import javax.inject.Inject

class SampleRemoteDataSourceImpl @Inject constructor() : SampleRemoteDataSource {

    override suspend fun fetch(id: Int): Sample {
        delay(500)

        var text = ""
        when (id) {
            1 -> text = "1"
            2 -> text = "2"
            3 -> text = "3"
        }
        return Sample(text)
    }
}
