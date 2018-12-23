package com.example.laura.asynctaskapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class SpeciesAdapter(val context: Context, val species: List<Kind>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.species_list, parent, false)

        val nameText = rowView!!.findViewById<TextView>(R.id.name)
        nameText.text = "Name: " + species[position].name?.trim()

        val classificationText = rowView!!.findViewById<TextView>(R.id.classification)
        classificationText.text = "Classification: " + species[position].classification?.trim()

        val designationText = rowView!!.findViewById<TextView>(R.id.designation)
        designationText.text = "Designation: " + species[position].designation?.trim()

        val average_heightText = rowView!!.findViewById<TextView>(R.id.average_height)
        average_heightText.text = "Average height: " + species[position].average_height?.trim()

        val skin_colorsText = rowView!!.findViewById<TextView>(R.id.skin_colors)
        skin_colorsText.text = "Skin colors: " + species[position].skin_colors?.trim()

        val hair_colorsText = rowView!!.findViewById<TextView>(R.id.hair_colors)
        hair_colorsText.text = "Hair colors: " + species[position].hair_colors?.trim()

        val average_lifespanText = rowView!!.findViewById<TextView>(R.id.average_lifespan)
        average_lifespanText.text = "Average lifespan: " + species[position].average_lifespan?.trim()

        val languageText = rowView!!.findViewById<TextView>(R.id.language)
        languageText.text = "Language: " + species[position].language?.trim()


        return rowView
    }

    override fun getItem(position: Int): Any {
        return species[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return species .size
    }

}