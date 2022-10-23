package org.joisen.chapter02

import scala.io.StdIn

/**
 * @author : joisen 
 * @date : 16:57 2022/10/22 
 */
// 标准输入
object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    // 输入信息
    println("输入您的名字： ")
    val name:String = StdIn.readLine()
    println("输入您的年龄： ")
    val age:Int = StdIn.readInt()
    println(s"${age}岁的${name}来了  ")
  }
}
