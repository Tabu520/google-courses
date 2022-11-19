package com.example.forage.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Forageable entity to be stored in the forageable_database.
 */
@Entity(tableName = "forageable_database")
data class Forageable(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "address")
    val address: String,
    @ColumnInfo(name = "is_season")
    val inSeason: Boolean,
    @ColumnInfo(name = "notes")
    val notes: String?
)
