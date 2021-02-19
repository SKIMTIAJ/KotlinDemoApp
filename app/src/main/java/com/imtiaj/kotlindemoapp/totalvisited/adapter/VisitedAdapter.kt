package com.imtiaj.kotlindemoapp.totalvisited.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.totalvisited.model.VisitedList

class VisitedAdapter(val context:Context,val userList:ArrayList<VisitedList>):RecyclerView.Adapter<VisitedAdapter.ViewHolder>() {

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val date = itemView.findViewById<TextView>(R.id.listTitle)
        val totalRequest = itemView.findViewById<TextView>(R.id.totalRequesValue)
        val totalEarning = itemView.findViewById<TextView>(R.id.totalEarningValue)
        val totalKm = itemView.findViewById<TextView>(R.id.totaldistanceValue)
        val satisfiedCustomer = itemView.findViewById<TextView>(R.id.satisfiedCustomerValue)
        val parentView = itemView.findViewById<CardView>(R.id.cardView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //TODO("Not yet implemented")

        val inflate = LayoutInflater.from(context).inflate(R.layout.visited_list,parent,false)
        return ViewHolder(inflate)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //TODO("Not yet implemented")
        holder.date.setText(userList.get(position).date)
        holder.totalRequest.setText(userList.get(position).totalRequest)
        holder.totalEarning.setText(userList.get(position).totalEarning)
        holder.totalKm.setText(userList.get(position).totalKm)
        holder.satisfiedCustomer.setText(userList.get(position).satisfiedCustomer)

        if (userList.get(position).date.equals("Today")){
            holder.date.setTextColor(ContextCompat.getColor(context,R.color.light_green))
            holder.parentView.backgroundTintList = ContextCompat.getColorStateList(context, R.color.white)
        }
    }
}

