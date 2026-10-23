package com.example.managementapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    // simpan tugas baru ke DB
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: TaskEntity)

    // menampilkan data
    @Query("SELECT * FROM table_tasks ORDER BY id DESC")
    fun getAllTask(): Flow<List<TaskEntity>>

    //update data
    @Update
    suspend fun updateTask(task: TaskEntity)

    //hapus data
    @Delete
    suspend fun deleteTask)(task: TaskEntity)

}