package com.example.testimoni

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    var title: String = "",
    var year: String = "",
    var times: String = "",
    var photo: String = "",
    var description: String = "",
    var rating: String = "",
    var topCast: String = "",
    var director: String = "",
    var writer: String = "",
    var storyline: String = "",
): Parcelable
