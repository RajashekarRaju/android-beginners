package com.developersbreach.androidbeginners

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(
    private val sportsList: List<Movie>
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val title: TextView = itemView.findViewById(R.id.item_movie_title)

        fun bind(
            movie: Movie
        ) {
            title.text = movie.title
            title.setOnClickListener {
                Toast.makeText(title.context, movie.title, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_movie,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: Movie = sportsList[position]
        holder.bind(movie)
    }

    override fun getItemCount() = sportsList.size
}