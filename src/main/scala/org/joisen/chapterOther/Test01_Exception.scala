package org.joisen.chapterOther

/**
 * @author : joisen 
 * @date : 16:01 2022/10/27 
 */
object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try{
      val n = 10 / 0
    }catch {
      case e: ArithmeticException => {
        println("算数异常")
      }
      case e: Exception => {
        println("异常")
      }
    }finally {
      println("finally")
    }

  }
}
