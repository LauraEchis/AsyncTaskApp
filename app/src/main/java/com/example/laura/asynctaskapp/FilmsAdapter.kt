package com.example.laura.asynctaskapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class FilmsAdapter(val context: Context, val films: List<Film>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.films_list, parent, false)

        val titleText = rowView!!.findViewById<TextView>(R.id.title)
        titleText.text = "Title: " + films[position].title

        val episode_idText = rowView!!.findViewById<TextView>(R.id.episode_id)
        episode_idText.text = "Episode ID: " + films[position].episode_id

        val directorText = rowView!!.findViewById<TextView>(R.id.director)
        directorText.text = "Director: " + films[position].director

        val producerText = rowView!!.findViewById<TextView>(R.id.producer)
        producerText.text = "Producer: " + films[position].producer

        val release_dateText = rowView!!.findViewById<TextView>(R.id.release_date)
        release_dateText.text = "Release date: " + films[position].release_date

        return rowView
    }

    override fun getItem(position: Int): Any {
        return films[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return films.size
    }

}