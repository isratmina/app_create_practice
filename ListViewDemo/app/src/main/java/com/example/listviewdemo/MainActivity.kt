package org.freedu.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listView = findViewById(R.id.listView)


        val countryList:ArrayList<Country> = ArrayList<Country>()

        countryList.add(Country(R.color.black, "United States ", "The United States of America (USA), commonly known as the United States (U.S.) or America, is a country primarily located in North America."))
        countryList.add(Country(R.color.black, "Australia", "Australia is the largest country by area in Oceania and the world's sixth-largest country."))
        countryList.add(Country(R.color.black, "Canada", "Canada is a country in North America. Its ten provinces and three territories extend from the Atlantic Ocean to the Pacific Ocean and northward into the Arctic Ocean, making it the world's second-largest country by total area, with the world's longest coastline."))

        val CountryAdapter = CountryAdapter(this, countryList)

        listView.adapter = CountryAdapter

    }
}