package com.cnc.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.cnc.myapplication.R
import com.cnc.myapplication.datas.Room

class Roomadapter(val mContext: Context, val resId: Int, val mList:ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {
    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return은 항상 지운다
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inflater.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!! //!!는 절대 null이 아냐!
        return row
    }
}