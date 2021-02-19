package com.imtiaj.kotlindemoapp.totalvisited

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.notification.adapter.NotificationAdapter
import com.imtiaj.kotlindemoapp.notification.model.NotificationList
import com.imtiaj.kotlindemoapp.totalvisited.adapter.VisitedAdapter
import com.imtiaj.kotlindemoapp.totalvisited.model.VisitedList

class TotalVisitedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_total_visited)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        val usersItem = ArrayList<VisitedList>();

       /* for(i in 1..4){
            usersItem.add(
                NotificationList("Request Notification", "Request Name","Request Location",
                "Booking For checkup","It is a long established fact that reader will distract" +
                        "by the readable contact of a page when looking at its layout","01st jan, 2020","12:00am")
            )
        }*/

        usersItem.add(VisitedList("Today","5","₹ 15k","20k","`189"))
        usersItem.add(VisitedList("11th December,2020","50","₹ 56k","20k","`120"))
        usersItem.add(VisitedList("10th December,2020","40","₹ 50k","500","`168"))
        usersItem.add(VisitedList("09th December,2020","35","₹ 45k","25k","`256"))

        val adapter = VisitedAdapter(applicationContext,usersItem)
        recyclerView.adapter = adapter

    }
}