package com.example.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MusicAlbumAdapter(getMusicAlbums())
    }

    private fun getMusicAlbums(): List<MusicAlbum> {
        return listOf(
            MusicAlbum("Album 1", "Artist 1", 2020, "aa"),
            MusicAlbum("Album 2", "Artist 2", 2018, "bb"),
            MusicAlbum("Album 3", "Artist 3", 2015, "cc"),
            MusicAlbum("Album 4", "Artist 4", 2017, "dd"),
            MusicAlbum("Album 5", "Artist 5", 2016,"ee"),
            MusicAlbum("Album 6", "Artist 6", 2019,"ad"),
            MusicAlbum("Album 7", "Artist 7", 2021,"fd"),
            MusicAlbum("Album 8", "Artist 8", 2014,"fdk"),
            MusicAlbum("Album 9", "Artist 9", 2013,"kdgj"),
            MusicAlbum("Album 10", "Artist 10", 2012,"vn"),
            MusicAlbum("Album 11", "Artist 11", 2011,"fdjh"),
            MusicAlbum("Album 12", "Artist 12", 2010, "kgfh"),
            MusicAlbum("Album 13", "Artist 13", 2009,"ee"),
            MusicAlbum("Album 14", "Artist 14", 2008,"fdjdfd"),
            MusicAlbum("Album 15", "Artist 15", 2007,"vmc"),
            MusicAlbum("Album 16", "Artist 16", 2006,"vcvc"),
            MusicAlbum("Album 17", "Artist 17", 2005,"aaaa"),
            MusicAlbum("Album 18", "Artist 18", 2004,"dflkjf"),
            MusicAlbum("Album 19", "Artist 19", 2003,"qqqq"),
            MusicAlbum("Album 20", "Artist 20", 2002,"ldkfjdkljfdkljfkld"),
            MusicAlbum("Album 21", "Artist 21", 2001,"kdfjhnsdklfdhskl"),
            MusicAlbum("Album 22", "Artist 22", 2000,"jsdfkl"),
            MusicAlbum("Album 23", "Artist 23", 1999,"cmbn"),
            MusicAlbum("Album 24", "Artist 24", 1998,"dofjs"),
            MusicAlbum("Master of Puppets", "Metallica", 1986,"Master of Puppets is the third studio album by the American heavy metal band Metallica, released on March 3, 1986, by Elektra Records.[1] Recorded in Copenhagen, Denmark at Sweet Silence Studios with producer Flemming Rasmussen, it was the band's final album to feature bassist Cliff Burton, who died in a bus accident in Sweden during the album's promotional tour.\n" +
                    "\n" +
                    "The album's artwork, designed by Metallica and Peter Mensch and painted by Don Brautigam, depicts a cemetery field of white crosses tethered to strings, manipulated by a pair of hands in a clouded, blood-red sky, with a fiery orange glow on the horizon. The album is the band’s most recent to date to feature a runtime under an hour. Instead of releasing a single or video in advance of the album's release, Metallica embarked on a five-month American tour in support of Ozzy Osbourne. The European leg was canceled after Burton's death in September 1986, and the band returned home to audition a new bassist.")
        )
    }
}