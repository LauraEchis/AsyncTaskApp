package com.example.laura.asynctaskapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class VehiclesAdapter(val context: Context, val vehicles: List<Vehicle>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.vehicles_list, parent, false)

        val nameText = rowView!!.findViewById<TextView>(R.id.name)
        nameText.text = "Name: " + vehicles[position].name

        val modelText = rowView!!.findViewById<TextView>(R.id.model)
        modelText.text = "Model: " + vehicles[position].model

        val manufacturerText = rowView!!.findViewById<TextView>(R.id.manufacturer)
        manufacturerText.text = "Manufacturer: " + vehicles[position].manufacturer

        val cost_in_creditsText = rowView!!.findViewById<TextView>(R.id.cost_in_credits)
        cost_in_creditsText.text = "Cost in credits: " + vehicles[position].cost_in_credits

        val lengthText = rowView!!.findViewById<TextView>(R.id.length)
        lengthText.text = "Length: " + vehicles[position].lenght

        val max_atmosphering_speedText = rowView!!.findViewById<TextView>(R.id.max_atmosphering_speed)
        max_atmosphering_speedText.text = "Max atmosphering speed: " + vehicles[position].max_atmosphering_speed

        val crewText = rowView!!.findViewById<TextView>(R.id.crew)
        crewText.text = "Crew: " + vehicles[position].crew

        val passengersText = rowView!!.findViewById<TextView>(R.id.passengers)
        passengersText.text = "Passengers: " + vehicles[position].passengers

        val cargo_capacityText = rowView!!.findViewById<TextView>(R.id.cargo_capacity)
        cargo_capacityText.text = "Cargo capacity: " + vehicles[position].cargo_capacity

        val consumablesText = rowView!!.findViewById<TextView>(R.id.consumables)
        consumablesText.text = "Consumables: " + vehicles[position].consumables

        val vehicle_classText = rowView!!.findViewById<TextView>(R.id.vehicle_class)
        vehicle_classText.text = "Vehicle class: " + vehicles[position].vehicle_class


        return rowView
    }

    override fun getItem(position: Int): Any {
        return vehicles[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return vehicles.size
    }

}