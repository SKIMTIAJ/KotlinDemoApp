package com.imtiaj.kotlindemoapp.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.notification.adapter.NotificationAdapter
import com.imtiaj.kotlindemoapp.notification.model.NotificationList

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        val usersItem = ArrayList<NotificationList>();

        for(i in 1..4){
            usersItem.add(NotificationList("Request Notification", "Request Name","Request Location",
                "Booking For checkup","It is a long established fact that reader will distract" +
                        "by the readable contact of a page when looking at its layout","01st jan, 2020","12:00am"))
        }


        val adapter = NotificationAdapter(usersItem)
        recyclerView.adapter = adapter

    }
}