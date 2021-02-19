package com.imtiaj.kotlindemoapp.booking

import android.app.Notification
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.notification.NotificationActivity
import kotlinx.android.synthetic.main.activity_booking_details.*

class BookingDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_details)

        acceptButton.setOnClickListener {
            val intent = Intent(applicationContext,NotificationActivity::class.java)
            startActivity(intent)
        }
    }
}