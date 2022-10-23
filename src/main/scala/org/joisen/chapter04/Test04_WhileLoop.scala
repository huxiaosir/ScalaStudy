package org.joisen.chapter04

/**
 * @author : joisen 
 * @date : 15:36 2022/10/23 
 */
object Test04_WhileLoop {
  def main(args: Array[String]): Unit = {
    // while
    var a: Int = 10
    while (a >= 1){
      println("This is while loop: "+a)
      a -= 1
    }
  }

}
