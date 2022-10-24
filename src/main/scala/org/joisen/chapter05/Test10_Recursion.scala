package org.joisen.chapter05

import scala.annotation.tailrec

/**
 * @author : joisen 
 * @date : 12:44 2022/10/24 
 */
object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))

  }
  // 递归实现 阶乘
  def fact(n: Int): Int = {
    if(n == 0) return 1
    fact(n - 1) * n
  }

  // 尾递归实现： 尾递归消耗资源小，只保留当前递归
  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, curRes: Int): Int = {
      if(n == 0) return curRes
      loop(n - 1, curRes * n)
    }
    loop(n, 1)
  }
}
