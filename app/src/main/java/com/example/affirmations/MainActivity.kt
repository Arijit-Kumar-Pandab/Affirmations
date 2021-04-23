 package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.model.Affirmation
import com.example.affirmations.model.affirmationAdapter

 class MainActivity : AppCompatActivity() {
    //private lateinit var textview: TextView
    private lateinit var thisrecyclerView: RecyclerView
    private lateinit var myAdapter: affirmationAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thisrecyclerView = findViewById(R.id.recyclerview)
        myAdapter = affirmationAdapter(this,loadData())
        thisrecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
            adapter = myAdapter
        }
    }
     fun loadData():List<Affirmation>{
         return listOf(
                 Affirmation(R.string.affirmation1,R.drawable.image1),
                 Affirmation(R.string.affirmation2,R.drawable.image2),
                 Affirmation(R.string.affirmation3,R.drawable.image3),
                 Affirmation(R.string.affirmation4,R.drawable.image4),
                 Affirmation(R.string.affirmation5,R.drawable.image5),
                 Affirmation(R.string.affirmation6,R.drawable.image6),
                 Affirmation(R.string.affirmation7,R.drawable.image7),
                 Affirmation(R.string.affirmation8,R.drawable.image8),
                 Affirmation(R.string.affirmation9,R.drawable.image9),
                 Affirmation(R.string.affirmation10,R.drawable.image10)
         )
     }
}