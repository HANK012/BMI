package com.hank.bmi

fun main() {
    var counter=0
    counter++
    println(counter)
    var a=true
    var b=true
    println(a||b)
    println(a&&b)
    var num=-9
    println((num<=5)&&(num>=-1))
    var name: String?=null
    println(name?.length)
    println(name?:0)//Elvis operator
    if (name!=null){ println(name)}
//For
//    val range=0..10
    for (i in 1..30)  println(i)
  println(a)



}
