package com.hank.bmi
//while 迴圈
fun main()  {
    //var secret: Int = (Math.random() * 10).toInt()+1
    var secret:Int=(0..10).random()
    //var secret: Int = kotlin.random.Random.nextInt(1, 11)
    var num=0
    println(secret)
    while (num!=secret) {
        println("enter the answer")
        val answer = readln()
        var num: Int = answer?.toIntOrNull() ?: continue//應提示重新輸入，而不是默認為 0：
        if (num > secret || num < secret) {
            println("wrong")
        } else {
            println("yes")
        break   }
    }





}