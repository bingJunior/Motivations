package com.bingjunior.motivations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bingjunior.motivations.adapter.PhotoAdapter
import com.bingjunior.motivations.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSource().loadQuotes()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = PhotoAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)

        // set a GridLayoutManager with default vertical orientation and 3 number of columns
        val gridLayoutManager = GridLayoutManager(applicationContext, 3)
        recyclerView.layoutManager = gridLayoutManager // set LayoutManager to RecyclerView
    }
}