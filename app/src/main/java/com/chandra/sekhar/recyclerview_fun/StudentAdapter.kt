package com.chandra.sekhar.recyclerview_fun

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(): ListAdapter<StudentModel, StudentAdapter.MyViewHolder>(diffCallBack){

    object diffCallBack : DiffUtil.ItemCallback<StudentModel>(){

        override fun areContentsTheSame(oldItem: StudentModel, newItem: StudentModel): Boolean {
            return oldItem.roll == newItem.roll
        }
        override fun areItemsTheSame(oldItem: StudentModel, newItem: StudentModel): Boolean {
            return oldItem == newItem
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false);
        return MyViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // get the data by this method and provided position
       val data = getItem(position)
      // Feed data to the views
        holder.name.text = data.name
        holder.roll.text = "Roll no : ${data.roll}"
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById(R.id.name) as TextView
        val roll = itemView.findViewById(R.id.roll) as TextView
    }

}
