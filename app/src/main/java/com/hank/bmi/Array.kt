package com.hank.bmi

fun main() {
    //陣列:同型態的變數
    val array= intArrayOf(1,2,5,7)//intArrayOf 是 Kotlin 提供的函數，用來創建 IntArray，即存放整數的陣列
    println(array[2])
    val ss= arrayOf("MON","TUES","WEN")//字串
    println(ss.size)
    println(ss.get(2))
    for (day in ss) println(day)
}


