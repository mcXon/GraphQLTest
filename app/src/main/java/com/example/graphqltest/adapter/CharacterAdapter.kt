package com.example.graphqltest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.graphqltest.CharactersListQuery
import com.example.graphqltest.R
import com.example.graphqltest.databinding.ItemCharacterBinding

class CharacterAdapter : ListAdapter<CharactersListQuery.Result, CharacterAdapter.CharacterViewHolder>(CharacterDiffUtil()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val binding : ItemCharacterBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_character,
            parent,
            false
        )
        return CharacterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.binding.character = getItem(position)
    }

    class CharacterViewHolder(val binding : ItemCharacterBinding) : RecyclerView.ViewHolder(binding.root)

}