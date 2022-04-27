package com.example.graphqltest.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.graphqltest.CharactersListQuery

class CharacterDiffUtil : DiffUtil.ItemCallback<CharactersListQuery.Result>() {
    override fun areItemsTheSame(
        oldItem: CharactersListQuery.Result,
        newItem: CharactersListQuery.Result
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: CharactersListQuery.Result,
        newItem: CharactersListQuery.Result
    ): Boolean {
        return oldItem.id == newItem.id
    }
}