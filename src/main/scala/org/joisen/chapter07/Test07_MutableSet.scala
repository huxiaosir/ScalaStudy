package org.joisen.chapter07

import scala.collection.mutable

/**
 * @author : joisen 
 * @date : 12:36 2022/10/26 
 */
object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    // 创建set
    val set1:mutable.Set[Int] = mutable.Set(1,3,5,7,9,2,4,6,8)
    println(set1)

    println("------------")
    // 添加元素
    val set2 = set1 + 11
    println(set2)

    set1 += 12
    println(set1)

    println("------------")
    set1.add(324)
    println(set1)

    println("------------")
    // 删除元素
    set1 -= 12
    println(set1)

    set1.remove(2)
    println(set1)

    println("------------")
    // 合并set
    val set3 = set1 ++ set2
    println(set1)
    println(set2)
    println(set3)

  }
}
