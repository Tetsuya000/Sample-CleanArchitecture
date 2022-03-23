package jp.gr.java.conf.tmproject.samplecleanarchitecture.presentation.di.source

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jp.gr.java.conf.tmproject.samplecleanarchitecture.data.source.local.SampleLocalDataSource
import jp.gr.java.conf.tmproject.samplecleanarchitecture.data.source.local.SampleLocalDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalDataSourceModule {

    @Singleton
    @Binds
    abstract fun bindSampleLocalDataSource(impl: SampleLocalDataSourceImpl): SampleLocalDataSource
}
