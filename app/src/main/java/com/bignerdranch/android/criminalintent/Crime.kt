package com.bignerdranch.android.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.*

@Entity
data class Crime(@PrimaryKey val id: UUID =
                     UUID.randomUUID(),
    var title: String = "",
    var date: String = getDate(),
    var isSolved: Boolean = false,
    var requirePolice: Boolean = false)

fun getDate(): String {
    val sdf = SimpleDateFormat("dd/M/yyyy ")
    return sdf.format(Date())
}