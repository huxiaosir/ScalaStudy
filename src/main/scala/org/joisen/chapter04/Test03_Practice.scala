package org.joisen.chapter04

/**
 * @author : joisen 
 * @date : 15:18 2022/10/23 
 */
object Test03_Practice {
  def main(args: Array[String]): Unit = {
//    for(i <- 1 to 9){
//      val stars = 2 * i - 1
//      val space = 9 - i
//      println(" " * space + "*" * stars)
//    }
    for(i <- 1 to 9;stars = 2 * i - 1;spaces = 9 - i){
      println(" " * spaces + "*" * stars)
    }

  }
}
