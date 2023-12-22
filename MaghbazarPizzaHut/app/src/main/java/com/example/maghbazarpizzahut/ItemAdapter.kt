package com.example.maghbazarpizzahut

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class ItemAdapter (context: Context,
                   countryList:ArrayList<Item>
    ): ArrayAdapter<Item>
    (context, 0, countryList) {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var itemView = convertView
            if(itemView == null) {
                itemView = LayoutInflater.from(context).inflate(R.layout.menu_item, parent, false)
            }
            val itemImage = itemView!!.findViewById<CircleImageView>(R.id.itemImage)
            val itemName = itemView.findViewById<TextView>(R.id.itemName)
            val itemType = itemView.findViewById<TextView>(R.id.itemType)

            itemImage.setImageResource(getItem(position)!!.itemImage)
            itemName.setText(getItem(position)!!.itemName)
            itemType.setText(getItem(position)!!.itemType)

            return itemView
        }
    }