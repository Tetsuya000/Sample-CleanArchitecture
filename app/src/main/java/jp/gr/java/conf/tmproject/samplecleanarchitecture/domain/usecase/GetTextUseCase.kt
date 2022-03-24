package jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.usecase

import jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.repository.SampleRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetTextUseCase @Inject constructor(
    private val sampleRepository: SampleRepository
) {

    companion object {
        private const val DEFAULT_TEXT = "Sample"
    }

    operator fun invoke(): Flow<String> {
        return sampleRepository.text.map { it.ifEmpty { DEFAULT_TEXT } }
    }
}
