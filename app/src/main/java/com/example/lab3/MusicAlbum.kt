package com.example.lab3

import android.os.Parcel
import android.os.Parcelable

data class MusicAlbum(
    val title: String,
    val artist: String,
    val year: Int,
    val description: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(artist)
        parcel.writeInt(year)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MusicAlbum> {
        override fun createFromParcel(parcel: Parcel): MusicAlbum {
            return MusicAlbum(parcel)
        }

        override fun newArray(size: Int): Array<MusicAlbum?> {
            return arrayOfNulls(size)
        }
    }
}

