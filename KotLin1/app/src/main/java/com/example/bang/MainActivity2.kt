package com.example.bang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)



        btn.setOnClickListener(View.OnClickListener {
            var a: String = edtUser.text.toString()
            var b: String  = edtPass.text.toString()

            if(a.equals("Hi") && b.equals("123")){
                var intent: Intent = Intent(this, MainActivity::class.java)
                intent.putExtra("TenDangNhap", "$a")

                val array: IntArray = intArrayOf(123,456,789)
                intent.putExtra("data", array)

                val sinhVien: SV = SV("Bang", "HaNoi", 2000, R.drawable.ic_banner_foreground)
                intent.putExtra("sinhVien", sinhVien)

                startActivity(intent)
            }else{
                Toast.makeText(this, "DN Lai", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

        })
    }
}