package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 12:31 2022/10/26 
 */
object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    // 创建set
    val set1 = Set(1,2,3,4,5,6,6,7)
    println(set1)

    println("------------")
    // 添加元素
    val set2 = set1 + 20
    println(set2)

    println("------------")
    // 合并set
    val set3 = Set(19, 20 ,39 ,82,15)
    val set4 = set2 ++ set3
    println(set4)

    println("------------")
    // 删除元素
    val set5 = set3 - 19
    println(set5)

  }
}
