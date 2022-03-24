package jp.gr.java.conf.tmproject.domain.usecase

import jp.gr.java.conf.tmproject.domain.repository.SampleRepository
import javax.inject.Inject

class UpdateTextUseCase @Inject constructor(
    private val sampleRepository: SampleRepository
) {

    suspend operator fun invoke(text: String) {
        sampleRepository.updateText(text)
    }
}
