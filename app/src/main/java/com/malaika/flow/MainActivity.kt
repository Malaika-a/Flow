package com.malaika.flow


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val comp=mutableListOf("Utensils","Decore","lamp","candles")
        val flow=findViewById<RecyclerView>(R.id.flo)
        flow.layoutManager= LinearLayoutManager(this)
        flow.adapter=flowcomp(comp)
    }
}