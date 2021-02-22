package com.imtiaj.kotlindemoapp.feedback.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlindemoapp.R
import com.imtiaj.kotlindemoapp.feedback.model.ReplyList

class ReplyAdapter(val replyList: ArrayList<ReplyList>):RecyclerView.Adapter<ReplyAdapter.ViewHolder>(){


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val replyTitle = itemView.findViewById<TextView>(R.id.replyTitle)
        val replyMessage = itemView.findViewById<TextView>(R.id.replyMessage)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReplyAdapter.ViewHolder {
        //TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.reply_list, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return replyList.size
    }

    override fun onBindViewHolder(holder: ReplyAdapter.ViewHolder, position: Int) {
        //TODO("Not yet implemented")
        holder.replyTitle.setText(replyList.get(position).replyTitle)
        holder.replyMessage.setText(replyList.get(position).replyMessage)

    }


}