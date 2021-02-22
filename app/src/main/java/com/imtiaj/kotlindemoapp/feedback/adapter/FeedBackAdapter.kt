package com.imtiaj.kotlindemoapp.feedback.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.feedback.model.FeedBackList

class FeedBackAdapter(val feedbackList:ArrayList<FeedBackList>, val context: Context): RecyclerView.Adapter<FeedBackAdapter.ViewHolder>(){

    val recycledViewPool = RecyclerView.RecycledViewPool()

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.feedbackImage)
        val userName = itemView.findViewById<TextView>(R.id.userName)
        val date = itemView.findViewById<TextView>(R.id.feedbackDate)
        val message = itemView.findViewById<TextView>(R.id.feedbackMessage)
        val recyclerView = itemView.findViewById<RecyclerView>(R.id.innerRecyclerView)
        val replyButton = itemView.findViewById<TextView>(R.id.replyText)
        val likeButton = itemView.findViewById<ImageView>(R.id.likeImage);
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedBackAdapter.ViewHolder {
        //TODO("Not yet implemented")
        val view = LayoutInflater.from(context).inflate(R.layout.feedback_list, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return feedbackList.size
    }

    override fun onBindViewHolder(holder: FeedBackAdapter.ViewHolder, position: Int) {
        //TODO("Not yet implemented")

        holder.image.setImageResource(feedbackList.get(position).image.toInt())
        holder.userName.setText(feedbackList.get(position).userName)
        holder.date.setText(feedbackList.get(position).feedbackDate)
        holder.message.setText(feedbackList.get(position).feedbackMessage)

        holder.recyclerView.layoutManager = LinearLayoutManager(holder.recyclerView.context, LinearLayoutManager.VERTICAL,false);
        val adapter = ReplyAdapter(feedbackList.get(position).replyList)

        holder.recyclerView.adapter = adapter

        holder.replyButton.setOnClickListener {
            holder.recyclerView.visibility = View.VISIBLE
        }

        holder.likeButton.setOnClickListener{
            holder.likeButton.setImageResource(R.drawable.like)
        }

    }


}

