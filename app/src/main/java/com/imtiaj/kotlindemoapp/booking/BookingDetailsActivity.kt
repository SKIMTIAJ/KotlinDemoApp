package com.imtiaj.kotlindemoapp.booking

import android.app.Notification
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.notification.NotificationActivity
import com.imtiaj.kotlindemoapp.totalvisited.TotalVisitedActivity
import kotlinx.android.synthetic.main.activity_booking_details.*
import kotlinx.android.synthetic.main.activity_profile.*

class BookingDetailsActivity : AppCompatActivity() {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_details)

        acceptButton.setOnClickListener {
            val intent = Intent(applicationContext,TotalVisitedActivity::class.java)
            startActivity(intent)
        }


        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {

            }
        })

        bottomSheetBackground.setOnClickListener{
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            bottomSheetBackground.visibility = View.GONE
        }

        declineButton.setOnClickListener{
            if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                bottomSheetBackground.visibility = View.GONE
            }
            else{
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
                bottomSheetBackground.visibility = View.VISIBLE
            }
        }



    }
}