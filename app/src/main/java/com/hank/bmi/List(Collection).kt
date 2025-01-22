package com.hank.bmi

import androidx.collection.mutableIntListOf

fun main() {
    //List 無法改變基本資料
    var list= listOf<Int>(2,5,8)//<T>Generic 泛型(資料型態)
    println(list)
    var list2= mutableListOf(1,3,5) //mutablelist  可變集合 add,replace,remove 方法可使用
    list2.add(13)
    println(list2)
}