
package com.example.managementapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.example.managementapp.databinding.ActivityAddTaskBinding

class addtaskactivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // mengambil data dari form saat tombol simpan diklik
        binding.tombolSave.setOnClickListener {
            val mapel = binding.editMapel.text.toString().trim()
            val judulTugas = binding.editJudulTugas.text.toString().trim()
            val deskripsi = binding.editDeskripsi.text.toString().trim()

            if (mapel.isEmpty() || judulTugas.isEmpty()) {
                Toast.makeText(
                    this,
                    "Mata pelajaran dan judul di isi",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this,
                    "tugas '$judulTugas' berhasil di simpan",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
