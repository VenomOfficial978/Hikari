package com.example.hikari.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hikari.R
import com.example.hikari.adapters.MangaAdapter
import com.example.hikari.models.Manga

class MangaFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_manga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.mangaRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Dummy data for now
        val dummyMangaList = listOf(
            Manga("One Piece", "https://dummyimage.com/4"),
            Manga("Naruto", "https://dummyimage.com/5"),
            Manga("Bleach", "https://dummyimage.com/6")
        )

        recyclerView.adapter = MangaAdapter(dummyMangaList)
    }
}
