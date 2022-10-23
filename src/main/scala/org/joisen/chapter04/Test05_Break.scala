package org.joisen.chapter04

import scala.util.control.Breaks

/**
 * @author : joisen 
 * @date : 15:56 2022/10/23 
 */
object Test05_Break {
  def main(args: Array[String]): Unit = {
    // 采用抛出异常的方式退出循环
    try{
      for(i <- 0 to 5){
        if(i == 3)
          throw new RuntimeException
        println(i)
      }
    }catch {
      case e : Exception => // 什么都不做，只是退出循环
    }
    println("==========================")
    // 使用scala中Breaks类的break方法，实现异常的抛出和捕获
    Breaks.breakable(
      for(i <- 0 until 5){
        if(i == 3)
          Breaks.break()
        println(i)
      }
    )


    println("Out Code !")

  }

}
