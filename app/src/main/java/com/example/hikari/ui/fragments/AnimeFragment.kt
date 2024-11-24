package com.example.hikari.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hikari.R
import com.example.hikari.adapters.AnimeAdapter
import com.example.hikari.models.Anime

class AnimeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_anime, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.animeRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Dummy data for now
        val dummyAnimeList = listOf(
            Anime("Attack on Titan", "https://dummyimage.com/1"),
            Anime("Demon Slayer", "https://dummyimage.com/2"),
            Anime("Jujutsu Kaisen", "https://dummyimage.com/3")
        )

        recyclerView.adapter = AnimeAdapter(dummyAnimeList)
    }
}
