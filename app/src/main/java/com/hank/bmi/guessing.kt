package com.hank.bmi

import kotlin.random.Random
import kotlin.random.nextInt

fun main()  {
    //println()第一階層function
    val secret:Int=(Math.random()*10).toInt()+1
    //ath.random() 會返回一個 Double，但 secret 被定義為 Int，導致型別不匹配。
    println(secret)
    println("plz enter an number(1-10)")
    val input=readln()//讀取使用者輸入為字串
    val num:Int=input?.toIntOrNull()?:0    //Elvis operator if input=null==> output is 0
//    println("the number you enter is "+ input) or
    println("the number you enter is $num") //use $+variable in String
//    println("${input?.length}")   use $+variable.function in String
    if (num<secret){
        println("bigger")}
    else if (num>secret){
        println("smaller") }
    else{
        println("YOU GOT IT") }

}
