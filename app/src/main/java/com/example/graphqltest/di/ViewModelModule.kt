package com.example.graphqltest.di

import com.example.graphqltest.repository.ICharacterRepository
import com.example.graphqltest.repository.ICharacterRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {
    @Binds
    @ViewModelScoped
    abstract fun bindRepository(repo : ICharacterRepositoryImpl) : ICharacterRepository
}