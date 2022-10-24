package org.joisen.chapter05

/**
 * @author : joisen 
 * @date : 15:46 2022/10/24 
 */
object Test13_Lazy {
  def main(args: Array[String]): Unit = {

    lazy val result: Int = sum(1,2)

    println("1. 函数调用")
    println("2. result = "+ result)
    println("4. result = "+ result)

  }
  def sum(a: Int,b: Int): Int = {
    println("3. sum调用")
    a + b
  }
}
