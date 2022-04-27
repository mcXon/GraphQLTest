package com.example.graphqltest.repository

import com.apollographql.apollo.api.Response
import com.apollographql.apollo.coroutines.await
import com.example.graphqltest.CharactersListQuery
import com.example.graphqltest.networking.RickAndMortyApi
import javax.inject.Inject

class ICharacterRepositoryImpl @Inject constructor(private val webService : RickAndMortyApi): ICharacterRepository {
    override suspend fun queryCharacterList(): Response<CharactersListQuery.Data> {
        return webService.getApolloClient().query(CharactersListQuery()).await()
    }
}