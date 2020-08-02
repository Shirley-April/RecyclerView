package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(listOf(
            NamesRecyclerViewAdapter.Persons("Sam", 21, "May2000", "Swiming"),
            NamesRecyclerViewAdapter.Persons("Kate", 19, "May2000", "Reading"),
            NamesRecyclerViewAdapter.Persons("Mwema", 45, "May2000", "Dancing"),
            NamesRecyclerViewAdapter.Persons("Halima", 54, "May2000", "Hiking"),
            NamesRecyclerViewAdapter.Persons("Kol", 14, "May2000", "Playing"),
            NamesRecyclerViewAdapter.Persons("Data", 23, "May2000", "Reading"),
            NamesRecyclerViewAdapter.Persons("Kaleb", 14, "May2000", "Drawing"),
            NamesRecyclerViewAdapter.Persons("Kalesi", 12, "May2000", "Swiming"),
            NamesRecyclerViewAdapter.Persons("Sam", 14, "May2000", "Coding")
        ))
        rvNames.adapter = namesAdapter
    }
}