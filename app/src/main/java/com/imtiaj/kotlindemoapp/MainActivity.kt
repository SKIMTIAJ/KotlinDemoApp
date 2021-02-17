package com.imtiaj.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlindemoapp.adapter.RequestListAdapter
import com.imtiaj.kotlindemoapp.model.RequestList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        val usersItem = ArrayList<RequestList>();

        usersItem.add(RequestList("Dipan Karmakar", "Pick addreass wiil be here"))
        usersItem.add(RequestList("Dipan Karmakar", "Pick addreass wiil be here"))
        usersItem.add(RequestList("Dipan Karmakar", "Pick addreass wiil be here"))


        val adapter = RequestListAdapter(usersItem)
        recyclerView.adapter = adapter
    }
}