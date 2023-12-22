package com.example.maghbazarpizzahut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


class Menu : AppCompatActivity() {
    private lateinit var menu:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        menu = findViewById(R.id.menu)

        val menuList:ArrayList<Item> = ArrayList<Item>()

        menuList.add(Item(R.color.black, "Margarito", "Vegetarian", "uershioegtjq34ojreiokewokfm"))
        menuList.add(Item(R.color.black, "Papperoni", "Meat", "uershioegtjq34ojreiokewokfm"))
        menuList.add(Item(R.color.black, "Calzonne", "Meat", "uershioegtjq34ojreiokewokfm"))

        val menuAdapter = ItemAdapter(this,menuList)

        menu.adapter = menuAdapter
    }
}
