package com.example.swengineering

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom_list_anthology.view.*



class Data_Anthology(val Title:String, val name:String,val thumb:String)


class CustomViewHolder_Anthology(v: View) : RecyclerView.ViewHolder(v){
    val Title = v.textView_Anthology_TopicName
    val name = v.textView_Anthology_UserName
    val thumb = v.textView_Anthology_thumb
}


class CustomAdapter_Anthology (val DataList:ArrayList<Data_Anthology>,val context: Context): RecyclerView.Adapter<CustomViewHolder_Anthology>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder_Anthology {
        val cellForRow = LayoutInflater.from(context).inflate(R.layout.custom_list_anthology,parent,false)
        return CustomViewHolder_Anthology(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder_Anthology, position: Int) {
        val curData = DataList[position]
        holder.Title.text = curData.Title
        holder.name.text = curData.name
        holder.thumb.text = curData.thumb
        holder.itemView.setOnClickListener{
            Toast.makeText(context,curData.Title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = DataList.size

}
