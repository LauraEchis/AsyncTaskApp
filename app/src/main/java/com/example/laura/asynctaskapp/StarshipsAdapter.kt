package com.example.laura.asynctaskapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class StarshipsAdapter(val context: Context, val starships: List<Starship>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            val rowView = inflater.inflate(R.layout.starships_list, parent, false)

            val nameText = rowView!!.findViewById<TextView>(R.id.name)
            nameText.text = "Name: " + starships[position].name

            return rowView
    }

    override fun getItem(position: Int): Any {
        return starships[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return starships.size
    }

}