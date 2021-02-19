package com.imtiaj.kotlindemoapp.notification.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.notification.model.NotificationList

class NotificationAdapter(val userList:ArrayList<NotificationList>): RecyclerView.Adapter<NotificationAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItems(user: NotificationList){
            val requestTitle = itemView.findViewById(R.id.listTitle) as TextView
            val requestName = itemView.findViewById(R.id.requestName) as TextView
            val requestLocation = itemView.findViewById(R.id.locationName) as TextView
            val bookingForCheckup = itemView.findViewById(R.id.bookingForCheckup) as TextView
            val requestMessage = itemView.findViewById(R.id.requestMessage) as TextView
            val requestDate = itemView.findViewById(R.id.date) as TextView
            val requestTime = itemView.findViewById(R.id.time) as TextView

            requestTitle.setText(user.requestTitle)
            requestName.setText(user.requestName)
            requestLocation.setText(user.requestLocation)
            bookingForCheckup.setText(user.bookingForCheckup)
            requestMessage.setText(user.requestMessage)
            requestDate.setText(user.date)
            requestTime.setText(user.time)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationAdapter.ViewHolder {
        //TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.notification_list,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return userList.size
    }

    override fun onBindViewHolder(holder: NotificationAdapter.ViewHolder, position: Int) {
        //TODO("Not yet implemented")
        holder.bindItems(userList[position])
    }
}