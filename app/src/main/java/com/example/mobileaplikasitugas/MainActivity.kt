package com.example.mobileaplikasitugas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileaplikasitugas.adapter.NewsAdapter as MobileaplikasitugasAdapterNewsAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var newsAdapter: MobileaplikasitugasAdapterNewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi RecyclerView
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Inisialisasi Adapter
        newsAdapter =
            MobileaplikasitugasAdapterNewsAdapter(getSampleNews()) // Menggunakan metode untuk mendapatkan data berita (contoh)
        recyclerView.adapter = newsAdapter
    }

    // Contoh data berita sederhana
    private fun getSampleNews(): List<News> {
        val newsList = ArrayList<News>()
        newsList.add(News(
            "Bank Sentral Indonesia Menaikkan Suku Bunga"
        ))
        newsList.add(News(
            "Bank XYZ Merilis Laporan Keuangan Kuartal Pertama"
        ))
        // Tambahkan berita lainnya sesuai kebutuhan
        return newsList
    }

    data class News(val title: String, val content: String = "", val author: String = "") {
        val description: Any
            get() = TODO()
    }

}




