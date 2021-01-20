package com.miguefagundez.autocompletedemo

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Members
    lateinit var autoCompleteTextView : AutoCompleteTextView
    lateinit var textViewCountry : TextView
    lateinit var listCountries : Array<String>
    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupMembers()
        setupListCountries()
        setupAdapter()
        setupAutoComplete()
        setupListeners()
    }

    private fun setupListeners() {
        autoCompleteTextView.setOnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->
            textViewCountry.text = adapter.getItem(i)
        }

    }

    private fun setupAutoComplete() {
        autoCompleteTextView.setAdapter(adapter)
        // Checking list after write the first character
        autoCompleteTextView.threshold = 1
    }

    private fun setupAdapter() {
        adapter = ArrayAdapter<String>(
            applicationContext,
            android.R.layout.simple_list_item_1,
            listCountries
        )
    }

    private fun setupListCountries() {
        // Taking list of countries from strings.xml
        listCountries = resources.getStringArray(R.array.countries)
    }

    private fun setupMembers() {
        autoCompleteTextView = findViewById(R.id.autoCompleteCountries)
        textViewCountry = findViewById(R.id.tvCountryName)
    }
}