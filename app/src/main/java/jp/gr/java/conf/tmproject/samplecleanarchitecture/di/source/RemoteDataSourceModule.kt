package jp.gr.java.conf.tmproject.samplecleanarchitecture.di.source

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jp.gr.java.conf.tmproject.data.source.remote.SampleRemoteDataSource
import jp.gr.java.conf.tmproject.data.source.remote.SampleRemoteDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {

    @Singleton
    @Binds
    abstract fun bindSampleRemoteDataSource(impl: SampleRemoteDataSourceImpl): SampleRemoteDataSource
}
