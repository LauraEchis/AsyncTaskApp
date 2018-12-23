package com.example.laura.asynctaskapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class PlanetsAdapter(val context: Context, val planet: List<Planet>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.planets_list, parent, false)

        val nameText = rowView!!.findViewById<TextView>(R.id.name)
        nameText.text = "Name: " + planet[position].name

        val rotation_periodText = rowView!!.findViewById<TextView>(R.id.rotation_period)
        rotation_periodText.text = "Rotation period: " + planet[position].rotation_period

        val orbital_periodText = rowView!!.findViewById<TextView>(R.id.orbital_period)
        orbital_periodText.text = "Orbital period: " + planet[position].orbital_period

        val diameterText = rowView!!.findViewById<TextView>(R.id.diameter)
        diameterText.text = "Diameter: " + planet[position].diameter

        val climateText = rowView!!.findViewById<TextView>(R.id.climate)
        climateText.text = "Climate: " + planet[position].climate

        val gravityText = rowView!!.findViewById<TextView>(R.id.gravity)
        gravityText.text = "Gravity: " + planet[position].gravity

        val terrainText = rowView!!.findViewById<TextView>(R.id.terrain)
        terrainText.text = "Terrain " + planet[position].terrain

        val surface_waterText = rowView!!.findViewById<TextView>(R.id.surface_water)
        surface_waterText.text = "Surface water: " + planet[position].surface_water

        val populationText = rowView!!.findViewById<TextView>(R.id.population)
        populationText.text = "Population: " + planet[position].population


        return rowView
    }

    override fun getItem(position: Int): Any {
        return planet[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return planet.size
    }

}