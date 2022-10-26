package org.joisen.chapter07

import scala.collection.mutable

/**
 * @author : joisen 
 * @date : 15:08 2022/10/26 
 */
object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    // 创建可变map
    val map1: mutable.Map[String,Int] = mutable.Map("a" -> 1,"b"->2,"c"->3)
    println(map1)
    println(map1.getClass)

    println("------------")

    // 添加元素
    map1.put("d",4)
    map1.put("e",5)
    println(map1)

    map1 += (("f", 7))
    println(map1)
    println("------------")

    // 删除元素
    println(map1("c"))
    map1.remove("c")
    println(map1.getOrElse("c",0))
    println(map1)

    map1 -= "f"
    println(map1)
    println("------------")
    // 修改元素
    map1.update("c",3)  // 当没有该key时执行添加操作，有该key时执行修改操作
    map1.update("e",55)
    println(map1)
    println("------------")

    // 合并两个map
    val map2: Map[String,Int] = Map("aa" -> 1,"b"->22,"cc"->3)
    map1 ++= map2 // map1中没有map2的的key时，则添加，有则覆盖 只有可变set能合并另一个
    println(map1)
    println(map2)

    println("------------")

    //

  }
}
