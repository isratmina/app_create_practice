package org.freedu.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class PlayerAdapter(context:Context, countryList:ArrayList<Country>):ArrayAdapter<Country>(context, 0, countryList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if(listItemView == null){
            listItemView = LayoutInflater.from(context).inflate(R.layout.Country_item, parent, false)
        }

        val countryFlag = listItemView!!.findViewById<CircleImageView>(R.id.countryFlag)
        val countryName = listItemView!!.findViewById<TextView>(R.id.countryName)
        val countryDetails = listItemView!!.findViewById<TextView>(R.id.countryDetails)

        countryName.setText(getItem(position)!!.countryName)
        countryDetails.setText(getItem(position)!!.countryDetails)
        countryFlag.setImageResource(getItem(position)!!.countryFlag)

        return listItemView
    }
}