package com.example.managementapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// Memberitahu Room bahwa class ini adalah
@Entity(tableName = "table_tasks")
data class TaskEntity(

    // Primary key dengan ID otomatis
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    // Kolom tabel
    val mapel: String,
    val judulTugas: String,
    val deskripsi: String,
    val etTime: String
)