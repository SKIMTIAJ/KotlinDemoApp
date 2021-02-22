package com.imtiaj.kotlindemoapp.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.textfield.TextInputLayout
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.feedback.FeedBackActivity
import com.imtiaj.kotlindemoapp.totalvisited.TotalVisitedActivity
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>
   /* private lateinit var dimBackground:View*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        saveButton.setOnClickListener {
           /* val intent = Intent(applicationContext,TotalVisitedActivity::class.java)
            startActivity(intent)*/
        }
        profileHeader.setOnClickListener {
            val intent = Intent(applicationContext,FeedBackActivity::class.java)
            startActivity(intent)
        }

        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {

            }
        })

        dimBackground.setOnClickListener{
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            dimBackground.visibility = View.GONE
        }

        profileEditText.setOnClickListener{
                if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED) {
                    bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                    dimBackground.visibility = View.GONE
                }
                else{
                    bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
                    dimBackground.visibility = View.VISIBLE
                }
        }
    }
}