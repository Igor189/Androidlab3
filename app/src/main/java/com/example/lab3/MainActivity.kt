package com.example.lab3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var twoPane = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        twoPane = findViewById<View>(R.id.detailsContainer) != null

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.albumListContainer, AlbumListFragment())
                .commitNow()

            if (twoPane) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.detailsContainer, DetailsFragment())
                    .commitNow()
            }
        }
    }

    fun showDetails(album: MusicAlbum) {
        if (twoPane) {
            val detailsFragment = DetailsFragment().apply {
                arguments = Bundle().apply {
                    putParcelable("album", album)
                }
            }

            supportFragmentManager.beginTransaction()
                .replace(R.id.detailsContainer, detailsFragment)
                .commit()
        } else {
            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtra("title", album.title)
                putExtra("artist", album.artist)
                putExtra("year", album.year)
                putExtra("description", album.description)
            }
            startActivity(intent)
        }
    }
}
