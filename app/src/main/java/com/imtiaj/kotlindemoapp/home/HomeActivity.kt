package com.imtiaj.kotlindemoapp.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.booking.BookingDetailsActivity
import com.imtiaj.kotlindemoapp.home.adapter.RequestListAdapter
import com.imtiaj.kotlindemoapp.home.model.RequestList
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        val usersItem = ArrayList<RequestList>();

        usersItem.add(RequestList("Dipan Karmakar", "Pick addreass wiil be here"))
        usersItem.add(RequestList("Dipan Karmakar", "Pick addreass wiil be here"))
        usersItem.add(RequestList("Dipan Karmakar", "Pick addreass wiil be here"))


        val adapter = RequestListAdapter(usersItem)
        recyclerView.adapter = adapter

        notificationIcon.setOnClickListener{
            startActivity(Intent(this,BookingDetailsActivity::class.java))
        }

    }
}