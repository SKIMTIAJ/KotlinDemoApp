package com.imtiaj.kotlindemoapp.feedback.model

data class FeedBackList(val image:String, val userName:String, val feedbackDate:String, val feedbackMessage:String, val replyList:ArrayList<ReplyList>)