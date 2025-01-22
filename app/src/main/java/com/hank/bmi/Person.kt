package com.hank.bmi
import androidx.compose.ui.Modifier
class Person constructor(val name:String, val weight:Float, val height:Float) {
//    var weight:Float=0f//屬性
//    var height:Float=0f//屬性
    fun bmi():Float //回傳一個浮點數
    {
     val bmi=weight/(height*height)//bmi local variable
        return bmi  //回傳結果
    }
    fun hello(){
    println("Hello")
    }
}