package com.example.bang

import android.util.Log
import java.io.Serializable

class SV(ht: String, dc: String, namSinh: Int, anh: Int): Serializable {
     var a: String =""
     var b: String =""
     var c: Int = 0
     var d: Int = 0
    init{
        a = ht
        b = dc
        c = namSinh
        d = anh
    }

     fun setNs(ns: Int){
         if(ns > 1999){
             c = 1999
         }else {
             c = ns
         }
     }

     fun getNS(): Int{
          return c
     }

    fun setTen(ns: String){
        a= ns

    }

    fun getTen(): String{
        return a
    }

    fun setQue(ns: String){
        b = ns
    }

    fun getQue(): String{
        return b
    }

    fun setAnh(ns: Int){
        d= ns
    }

    fun getAnh(): Int{
        return d
    }

}