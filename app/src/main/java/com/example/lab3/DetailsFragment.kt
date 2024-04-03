package com.example.lab3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val album = arguments?.getParcelable<MusicAlbum>("album")

        val titleTextView = view.findViewById<TextView>(R.id.titleTextView)
        val artistTextView = view.findViewById<TextView>(R.id.artistTextView)
        val yearTextView = view.findViewById<TextView>(R.id.yearTextView)
        val descriptionTextView = view.findViewById<TextView>(R.id.descriptionTextView)

        titleTextView.text = album?.title
        artistTextView.text = album?.artist
        yearTextView.text = album?.year.toString()
        descriptionTextView.text = album?.description

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=${album?.title} ${album?.artist}"))
            startActivity(intent)
        }
    }
}