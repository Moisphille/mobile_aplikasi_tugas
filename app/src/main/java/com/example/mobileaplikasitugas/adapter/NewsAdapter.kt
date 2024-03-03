package com.example.mobileaplikasitugas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileaplikasitugas.MainActivity
import com.example.mobileaplikasitugas.R

class NewsAdapter(private val newsList: List<MainActivity.News>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.titleTextView.text = currentItem.title
        currentItem.description.also { holder.descriptionTextView.text = it.toString() }
    }

    override fun getItemCount() = newsList.size
    fun addArticles() {
        TODO("Not yet implemented")
    }

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val descriptionTextView: TextView = itemView.findViewById<TextView>(R.id.descriptionTextView)
    }
}
