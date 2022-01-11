package com.example.bang

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecycler(val XeList: ArrayList<Xe>) : RecyclerView.Adapter<AdapterRecycler.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterRecycler.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_sv, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: AdapterRecycler.ViewHolder, position: Int) {
        holder.bindItem(XeList[position])
    }

    override fun getItemCount(): Int {
        return XeList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItem(xe: Xe){
            val tvNameXe: TextView = itemView.findViewById(R.id.tvNameSV)
            val tvBanhXe: TextView = itemView.findViewById(R.id.tvDiaChiSV)
            tvNameXe.text = xe.ten
            tvBanhXe.text = xe.banh.toString()
        }
    }
}