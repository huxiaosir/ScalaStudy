package org.joisen.chapter07

import scala.collection.mutable

/**
 * @author : joisen 
 * @date : 9:36 2022/10/27 
 */
object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9,"d" -> 3)

//    println(map1 ++ map2)  该操作进行的是覆盖操作

    val map3 = map1.foldLeft(map2)(
      (mergedMap,kv) => {
        val key = kv._1
        val value = kv._2
        mergedMap(key) = mergedMap.getOrElse(key, 0) + value
        mergedMap
      }
    )  // map2是初始状态，即对map2中的元素与map1中的元素进行操作，改变的是map2
    println(map3)
    println(map2)
    println(map1)
    println("=================")



  }

}
