package com.malaika.flow


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class flowcomp (private val comp: MutableList<String>): RecyclerView.Adapter<flowcomp.NameViewHolder>(){
    class NameViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){
        val compp: TextView=itemView.findViewById(R.id.fow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
       val view= LayoutInflater.from(parent.context).inflate(R.layout.flow_comp,
        parent,false)
        return NameViewHolder(view)
    }
    override fun onBindViewHolder(
        holder: NameViewHolder,
        position: Int
    ){
        holder.compp.text=comp[position]
    }
    override fun getItemCount(): Int {
        return comp.size

    }
}