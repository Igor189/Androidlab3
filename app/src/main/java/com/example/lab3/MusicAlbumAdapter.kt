package com.example.lab3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAlbumAdapter(
    private val albums: List<MusicAlbum>,
    private val onAlbumClick: (MusicAlbum) -> Unit
) : RecyclerView.Adapter<MusicAlbumAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val artistTextView: TextView = itemView.findViewById(R.id.artistTextView)
        val yearTextView: TextView = itemView.findViewById(R.id.yearTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_music_album, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val album = albums[position]
        holder.titleTextView.text = album.title
        holder.artistTextView.text = album.artist
        holder.yearTextView.text = album.year.toString()
        holder.itemView.setOnClickListener { onAlbumClick(album) }
    }

    override fun getItemCount(): Int = albums.size
}