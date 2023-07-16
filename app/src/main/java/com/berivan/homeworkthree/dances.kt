package com.berivan.homeworkthree

import android.app.Person
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class dances(
    val person: Person,
    val danstur: String,
    val spor: String,
    val kitap: String

) : Parcelable

