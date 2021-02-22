package com.imtiaj.kotlindemoapp.home.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.booking.BookingDetailsActivity
import com.imtiaj.kotlindemoapp.home.model.RequestList

class RequestListAdapter(val userList:ArrayList<RequestList>, val mContext: Context): Adapter<RequestListAdapter.ViewHolder>() {

    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

        val nameItem = itemView.findViewById(R.id.listName) as TextView
        val addressItem = itemView.findViewById(R.id.listAddress) as TextView
        val parentView = itemView.findViewById<CardView>(R.id.parentView)



        /*fun bindItems(user:RequestList){
        }*/
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RequestListAdapter.ViewHolder {
        //TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_list,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return userList.size
    }

    override fun onBindViewHolder(holder: RequestListAdapter.ViewHolder, position: Int) {
        //TODO("Not yet implemented")
        //holder.bindItems(userList[position])

        holder.nameItem.setText(userList[position].name)
        holder.addressItem.setText(userList[position].address)
        holder.parentView.setOnClickListener{
            val intent = Intent(mContext,BookingDetailsActivity::class.java)
            mContext.startActivity(intent)
        }
    }
}