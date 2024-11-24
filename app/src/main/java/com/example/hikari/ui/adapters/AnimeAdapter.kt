package com.example.hikari.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hikari.R
import com.example.hikari.models.Anime
import kotlinx.android.synthetic.main.item_anime.view.*

class AnimeAdapter(private val animeList: List<Anime>) :
    RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_anime, parent, false)
        return AnimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        val anime = animeList[position]
        holder.itemView.animeTitle.text = anime.title
        Glide.with(holder.itemView.context).load(anime.imageUrl).into(holder.itemView.animeImage)
    }

    override fun getItemCount() = animeList.size

    class AnimeViewHolder(view: View) : RecyclerView.ViewHolder(view)
}
