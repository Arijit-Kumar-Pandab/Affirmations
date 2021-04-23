 package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.data.loadAffirmations
import com.example.affirmations.model.affirmationAdapter

 class MainActivity : AppCompatActivity() {
    //private lateinit var textview: TextView
     private lateinit var thisrecyclerView: RecyclerView
     private lateinit var myAdapter: affirmationAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //textview = findViewById(R.id.mytext)
        //textview.text = loadAffirmations().loaddata().size.toString()
        thisrecyclerView = findViewById(R.id.recyclerview)
        myAdapter = affirmationAdapter(this,loadAffirmations().loaddata())
        thisrecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
            adapter = myAdapter
        }
    }
}