package com.example.laura.asynctaskapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class PeopleAdapter(val context: Context, val people: List<Person>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.people_list, parent, false)

        val nameText = rowView!!.findViewById<TextView>(R.id.name)
        nameText.text = "Name: " + people[position].name

        val heightText = rowView!!.findViewById<TextView>(R.id.height)
        heightText.text = "Height: " + people[position].height

        val massText = rowView!!.findViewById<TextView>(R.id.mass)
        massText.text = "Mass: " + people[position].mass

        val hairText = rowView!!.findViewById<TextView>(R.id.hair_color)
        hairText.text = "Hair color: " + people[position].hair_color

        val skinText = rowView!!.findViewById<TextView>(R.id.skin_color)
        skinText.text = "Skin color: " + people[position].skin_color

        val eyeText = rowView!!.findViewById<TextView>(R.id.eye_color)
        eyeText.text = "Eye color: " + people[position].eye_color

        val birthText = rowView!!.findViewById<TextView>(R.id.birth_year)
        birthText.text = "Birth year: " + people[position].birth_year

        val genderText = rowView!!.findViewById<TextView>(R.id.gender)
        genderText.text = "Gender: " + people[position].gender


        return rowView
    }

    override fun getItem(position: Int): Any {
        return people[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return people.size
    }

}