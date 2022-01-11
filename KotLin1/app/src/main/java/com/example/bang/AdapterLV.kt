package com.example.bang

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class AdapterLV(var context: Context, var SinhVien: ArrayList<SV>): BaseAdapter(){

    class ViewHolder(row: View){
        var anhSV: ImageView
        var tenSV :TextView
        var queSV :TextView
        var namSinhSV :TextView
        init {
            anhSV = row.findViewById(R.id.imgSV) as ImageView
            tenSV = row.findViewById(R.id.tvNameSV) as TextView
            queSV = row.findViewById(R.id.tvDiaChiSV) as TextView
            namSinhSV = row.findViewById(R.id.tvNamSinhSV) as TextView
        }
    }

    override fun getCount(): Int {
      return SinhVien.size
    }

    override fun getItem(position: Int): Any {
        return SinhVien.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View? {
        var view: View?
        var viewHolder: ViewHolder
        if(convertView == null){
            var layoutInflater: LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.item_sv, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view  = convertView
            viewHolder = convertView.tag as ViewHolder
        }
        var sinhVien : SV = getItem(position) as SV
        viewHolder.anhSV.setImageResource(sinhVien.d)
        viewHolder.tenSV.text = sinhVien.a
        viewHolder.queSV.text = sinhVien.b
        viewHolder.namSinhSV.text = sinhVien.c.toString()
        return  view
    }
}