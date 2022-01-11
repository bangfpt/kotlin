package com.example.bang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
//    private val tv: TextView by lazy { findViewById<TextView>(R.id.tv) }
//    private val btn: Button by lazy { findViewById<Button>(R.id.btn) }
//    private val tv2: TextView by lazy { findViewById<TextView>(R.id.tv2) }
//    private val tv3: TextView by lazy { findViewById<TextView>(R.id.tv3) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //listView activity1
//         var mang: ArrayList<SV> = arrayListOf()
//         mang.add(SV("Bang", "HaNoi", 2000, R.drawable.ic_banner_foreground))
//         listView.adapter = AdapterLV(this, mang)
        //RecycleView activity1
        listView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        var user = ArrayList<Xe>()
        user.add(Xe("Xe dap", 4))
        user.add(Xe("Xe may", 8))

        val adapter = AdapterRecycler(user)
        listView.adapter = adapter
        ///
//        var sv1 :SV = SV("A", "HaNoi", 2000)
//        sv1.setTen("A")
//        sv1.setQue("HaNoi")
//        sv1.setNs(2000)
//
//        Log.d("AAA", (+ sv1.getNS()).toString() +" "+ sv1.getTen() +" " + sv1.getQue())
//
//        val pt: Xe = Xe("Xe dap", 2)
//        Log.d("AAA", "Phuong tien" +pt)
//        btn.setOnClickListener(View.OnClickListener {
//            Cong()
//        })
//
//        btnT.setOnClickListener(View.OnClickListener {
//            Tru()
//        })
//
//        btnN.setOnClickListener(View.OnClickListener {
//            Nhan()
//        })
//
//        btnC.setOnClickListener(View.OnClickListener {
//            Chia()
//        })
//
//        btnAnh.setOnClickListener(View.OnClickListener {
//            setAnh()
//            layDuLieu()
//        })
//    }
//
//
//    fun B(){
//        btn.setOnClickListener(View.OnClickListener {view ->
//            val a = 5;
//            val result = "Total: $a"
//            tv.setText(result)
//        })
//    }
//
//    fun main() {
//        var dsSanPham= arrayOf("kotlin","java","c#","python","R")
//        for (i in dsSanPham.indices)
//        {
//            println("Sản phẩm thứ $i có tên" +dsSanPham[i])
//        }
//    }
//
//    fun test() {
//        var mang: ArrayList<String> = ArrayList()
//        mang.add("1")
//        mang.add("1")
//        mang.add("1")
//        mang.add("1")
//        ///m
//        mang.set(2, "3")
//        mang.removeAt(2)
//        tv.setText(mang.size.toString())
//    }
//
//    fun Cong(){
//        var a :Int = (tv.text.toString()).toInt()
//        var b : Int  = (tv2.text.toString()).toInt()
//        var kq :Int  = a+b
//        tv3.setText("ket qua la: " +kq.toString())
//    }
//
//    fun Tru(){
//        var a :Int = (tv.text.toString()).toInt()
//        var b : Int  = (tv2.text.toString()).toInt()
//        var kq :Int  = a-b
//        tv3.setText("ket qua la: " +kq.toString())
//    }
//
//    fun Nhan(){
//        var a :Int = (tv.text.toString()).toInt()
//        var b : Int  = (tv2.text.toString()).toInt()
//        var kq :Int  = a*b
//        tv3.setText("ket qua la: " +kq.toString())
//    }
//
//    fun Chia(){
//        var a :Int = (tv.text.toString()).toInt()
//        var b : Int  = (tv2.text.toString()).toInt()
//        if(b == 0){
//            Toast.makeText(this, "khong cho phep chia cho khong", Toast.LENGTH_SHORT).show()
//            return
//        }else{
//                var kq:Float  = (a.toFloat())/(b.toFloat())
//                tv3.setText("ket qua la: " +kq)
//            }
//    }
//
//    fun setAnh(){
//
//        img.setImageResource(R.drawable.ic_banner_foreground)
//    }
//
//    fun layDuLieu(){
//        val intent = intent
//        val tenDN: SV = intent.getSerializableExtra("sinhVien") as SV
//        tv.setText(tenDN.getTen() + " " + tenDN.getNS())
//
//        val data: IntArray? = intent.getIntArrayExtra("data")
//        if (data != null) {
//            tv2.setText(data.size.toString())
//        }
//
   }
}