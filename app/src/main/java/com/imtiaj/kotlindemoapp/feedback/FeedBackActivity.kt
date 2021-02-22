package com.imtiaj.kotlindemoapp.feedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.feedback.adapter.FeedBackAdapter
import com.imtiaj.kotlindemoapp.feedback.model.FeedBackList
import com.imtiaj.kotlindemoapp.feedback.model.ReplyList
import com.imtiaj.kotlindemoapp.notification.adapter.NotificationAdapter
import com.imtiaj.kotlindemoapp.notification.model.NotificationList

class FeedBackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_back)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        val adapter = FeedBackAdapter(feedBackList(),this)
        recyclerView.adapter = adapter
        
        
    }

    private fun feedBackList(): ArrayList<FeedBackList> {
        val feedbackList = ArrayList<FeedBackList>()
        val message = getString(R.string.feedbackmessage)
        feedbackList.add(FeedBackList(R.drawable.profileimg.toString(),"User Name","12/05/2020",message,replyList()))
        feedbackList.add(FeedBackList(R.drawable.profileimg.toString(),"User Name","12/05/2020",message,replyList()))
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
}