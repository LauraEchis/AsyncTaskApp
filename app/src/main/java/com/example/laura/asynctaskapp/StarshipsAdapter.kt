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
        val rowView = inflater.inflate(R.layout.vehicles_list, parent, false)

        val nameText = rowView!!.findViewById<TextView>(R.id.name)
        nameText.text = "Name: " + starships[position].name

        val modelText = rowView!!.findViewById<TextView>(R.id.model)
        modelText.text = "Model: " + starships[position].model

        val manufacturerText = rowView!!.findViewById<TextView>(R.id.manufacturer)
        manufacturerText.text = "Manufacturer: " + starships[position].manufacturer

        val cost_in_creditsText = rowView!!.findViewById<TextView>(R.id.cost_in_credits)
        cost_in_creditsText.text = "Cost in credits: " + starships[position].cost_in_credits

        val lengthText = rowView!!.findViewById<TextView>(R.id.length)
        lengthText.text = "Length: " + starships[position].lenght

        val max_atmosphering_speedText = rowView!!.findViewById<TextView>(R.id.max_atmosphering_speed)
        max_atmosphering_speedText.text = "Max atmosphering speed: " + starships[position].max_atmosphering_speed

        val crewText = rowView!!.findViewById<TextView>(R.id.crew)
        crewText.text = "Crew: " + starships[position].crew

        val passengersText = rowView!!.findViewById<TextView>(R.id.passengers)
        passengersText.text = "Passengers: " + starships[position].passengers

        val consumablesText = rowView!!.findViewById<TextView>(R.id.consumables)
        consumablesText.text = "Consumables: " + starships[position].consumables

        val hyperdrive_ratingText = rowView!!.findViewById<TextView>(R.id.hyperdrive_rating)
        hyperdrive_ratingText.text = "Hyperdrive rating: " + starships[position].hyperdrive_rating

        val MGLTText = rowView!!.findViewById<TextView>(R.id.MGLT)
        MGLTText.text = "MGLT: " + starships[position].MGLT

        val starship_classText = rowView!!.findViewById<TextView>(R.id.starship_class)
        starship_classText.text = "Starship class: " + starships[position].starship_class

        val cargo_capacityText = rowView!!.findViewById<TextView>(R.id.cargo_capacity)
        cargo_capacityText.text = "Cargo capacity: " + starships[position].cargo_capacity


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