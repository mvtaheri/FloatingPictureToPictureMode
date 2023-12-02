package com.vahid.floatingpicturetopicturemode

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        println("Clicked On Pip Action")
    }
}