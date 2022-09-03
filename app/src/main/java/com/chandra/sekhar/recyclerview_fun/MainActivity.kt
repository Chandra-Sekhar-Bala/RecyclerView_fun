package com.chandra.sekhar.recyclerview_fun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // taking reference
        val recyclerView  = findViewById<RecyclerView>(R.id.recyclerView)

        // Setting layout manager, in this case it's LinearLayoutManager
        recyclerView .layoutManager = LinearLayoutManager(this)

        val data = dummyData()

        // set up recycler view with adapter

        val adapter =  StudentAdapter()
        recyclerView.adapter = adapter

        adapter.submitList(data)

    }

    private fun dummyData(): List<StudentModel> {
        val list : ArrayList<StudentModel> = ArrayList()
        for(i in 1..20){
            list.add(StudentModel("Android", i))
        }
        return list
    }


}