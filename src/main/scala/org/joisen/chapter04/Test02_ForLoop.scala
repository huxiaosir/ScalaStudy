package org.joisen.chapter04

import scala.collection.immutable

/**
 * @author : joisen
 * @date : 11:16 2022/10/23
 */
object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
   // java for语法：for(int i=0;i<10;i++){System.out.println(i+ ". Hello World");}

    // 范围遍历
    for(i <- 1 to 10){
      println(i + ". hello world")
    }
    for(i <- 1.to(10)){
      println(i + ". hello world")
    }
    println("===================")
    for(i <- Range(1,10)){
      println(i+". hello world")
    }
    println("===================")
    for(i <- 1 until 10){
      println(i+". hello world")
    }

    println("===================")
    // 集合遍历
    for(i <- Array(1,2,5,6,4)){
      println(i)
    }
    println("===================")
    for(i <- List(1,2,5,6,4)){
      println(i)
    }
    println("===================")
    for(i <- Set(1,2,5,6,4)){
      println(i)
    }
    println("===================")
    // 循环守卫
    for(i <- 1 to 10 if i!= 5){
      println("i= "+i)
    }
    println("===================")
    // 循环步长
    for(i <- Range(1,10,2)){
      println("i= "+i)
    }
    for(i <- (1 to 10).by(2)){
      println("i= "+i)
    }
    for(i <- 1 to 10 by 2 ){
      println("i= "+i)
    }

    println("===================")
    // 嵌套循环
    for(i <- 1 to 3){
      for(j <- 1 to 3){
        println("双重循环1："+j)
      }
    }
    for(i <- 1 to 4;j <- 1 to 5){
      println("双重循环2："+j)
    }
    println("===================")
    // 乘法表
    for(i <- 1 to 9){
      for(j <- 1 to i){
        print(s"$j * $i = ${i*j} \t")
      }
      println()
    }
    // 简写
    for(i <- 1 to 9;j <- 1 to i){
      print(s"$j * $i = ${i*j} \t")
      if(j == i){
        println()
      }
    }

    println("===================")
    // 循环返回值
    val a = for (i <- 1 to 10) {
//      println(i)
      i
    }
    println("a = "+ a)


    val b: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i
    println("b = "+ b)



  }
}
