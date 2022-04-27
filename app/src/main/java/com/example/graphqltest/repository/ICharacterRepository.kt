package com.example.graphqltest.repository

import com.apollographql.apollo.api.Response
import com.example.graphqltest.CharactersListQuery

interface ICharacterRepository {
    suspend fun queryCharacterList() : Response<CharactersListQuery.Data>
}