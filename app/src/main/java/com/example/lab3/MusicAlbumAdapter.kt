package com.example.lab3

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MusicAlbumAdapter(private val albums: List<MusicAlbum>) :
    RecyclerView.Adapter<MusicAlbumAdapter.ViewHolder>() {

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
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailsActivity::class.java).apply {
                putExtra("title", album.title)
                putExtra("artist", album.artist)
                putExtra("year", album.year)
                putExtra("description", album.description)
            }
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int = albums.size
}