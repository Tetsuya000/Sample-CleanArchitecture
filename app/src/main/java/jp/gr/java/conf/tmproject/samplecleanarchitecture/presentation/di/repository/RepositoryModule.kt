package jp.gr.java.conf.tmproject.samplecleanarchitecture.presentation.di.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jp.gr.java.conf.tmproject.samplecleanarchitecture.data.repository.SampleRepositoryImpl
import jp.gr.java.conf.tmproject.samplecleanarchitecture.domain.repository.SampleRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindSampleRepository(impl: SampleRepositoryImpl): SampleRepository
}
