package org.joisen.chapter07

import scala.collection.mutable.ListBuffer

/**
 * @author : joisen 
 * @date : 12:08 2022/10/26 
 */
object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 创建可变列表
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2 = ListBuffer(12,23,34,45)
    println(list1)
    println(list2)
    println("------------")
    // 添加元素
    list1.append(13,24)
    list2.prepend(1)

    list1.insert(1,56,67) // 在1号位置插入元素56，67
    println(list1)
    println(list2)
    println("------------")

    31 +=: 90 +=: list1 += 123 += 222
    println(list1)


    // 合并list
    val list3 = list1 ++ list2
    println(list3)
    println("------------")

    list1 ++= list2
    println(list1)
    println(list2)
    println("------------")

    // 修改元素
    list2(3) = 44
    println(list2)
    // 删除元素
    list2.remove(2)
    println(list2)

  }
}
