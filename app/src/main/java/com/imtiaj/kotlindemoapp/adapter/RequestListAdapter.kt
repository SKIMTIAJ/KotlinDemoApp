package com.imtiaj.kotlindemoapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.model.RequestList

class RequestListAdapter(val userList:ArrayList<RequestList>): Adapter<RequestListAdapter.ViewHolder>() {

    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        fun bindItems(user:RequestList){
            val nameItem = itemView.findViewById(R.id.listName) as TextView
            val addressItem = itemView.findViewById(R.id.listAddress) as TextView

            nameItem.setText(user.name)
            addressItem.setText(user.address)
        }

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
        holder.bindItems(userList[position])
    }
}