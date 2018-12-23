package com.example.laura.asynctaskapp


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laura.asynctaskapp.R.id.parent

class MainAdapter(val peopleList: PeopleList): RecyclerView.Adapter<CustomViewHolder>(){

    val peopleName = listOf("Ohhhmyyy", "we are going deeper")

    override fun getItemCount(): Int {
        return peopleList.people.count()
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0?.context)
        val cellForRow = layoutInflater.inflate(R.layout.)
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view)