package com.imtiaj.kotlindemoapp.feedback

import android.content.Context
import android.os.Bundle
import android.view.GestureDetector
import android.view.GestureDetector.SimpleOnGestureListener
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.feedback.adapter.FeedBackAdapter
import com.imtiaj.kotlindemoapp.feedback.model.FeedBackList
import com.imtiaj.kotlindemoapp.feedback.model.ReplyList
import kotlinx.android.synthetic.main.activity_booking_details.*
import kotlinx.android.synthetic.main.activity_feed_back.*
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_profile.bottomSheet


class FeedBackActivity : AppCompatActivity(),ClickListener {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_back)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        val adapter = FeedBackAdapter(feedBackList(),this,this)
        recyclerView.adapter = adapter



        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {

            }
        })

        dimBackgroundColor.setOnClickListener{
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            dimBackgroundColor.visibility = View.GONE
        }

      /*  declineButton.setOnClickListener{
            if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                dimBackgroundColor.visibility = View.GONE
            }
            else{
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
                dimBackgroundColor.visibility = View.VISIBLE
            }
        }*/


        
    }

    private fun feedBackList(): ArrayList<FeedBackList> {
        val feedbackList = ArrayList<FeedBackList>()
        val message = getString(R.string.feedbackmessage)
        feedbackList.add(FeedBackList(R.drawable.profileimg.toString(),"User Name","12/05/2020",message,replyList()))
        feedbackList.add(FeedBackList(R.drawable.profileimg.toString(),"User Name","13/05/2020",message,replyList()))
        feedbackList.add(FeedBackList(R.drawable.profileimg.toString(),"User Name","12/05/2020",message,replyList()))
        feedbackList.add(FeedBackList(R.drawable.profileimg.toString(),"User Name","12/05/2020",message,replyList()))

        return feedbackList
    }

    private fun replyList(): ArrayList<ReplyList> {
        val replyList = ArrayList<ReplyList>()
        val message = getString(R.string.feedbackmessage)
        replyList.add(ReplyList("Your Reply",message))
        return replyList
    }

    /*class RecyclerTouchListener:RecyclerView.OnItemTouchListener {
            override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {
                //TODO("Not yet implemented")
            }

            override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
                // TODO("Not yet implemented")
            }

            override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {
                //TODO("Not yet implemented")
            }

        }*/

    override fun onCellClickListener() {
        //TODO("Not yet implemented")

        if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED) {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            dimBackgroundColor.visibility = View.GONE
        }
        else{
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
            dimBackgroundColor.visibility = View.VISIBLE
        }



        //Toast.makeText(this,"Cell clicked", Toast.LENGTH_SHORT).show()
    }

}