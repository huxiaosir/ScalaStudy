package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 15:54 2022/10/26 
 */
object Test11_CommonOp {
  def main(args: Array[String]): Unit = {
    val list = List(1,3,5,7)
    val set = Set(2,4,6,8)
    //    （1）获取集合长度
    println(list.length)

    //    （2）获取集合大小
    println(set.size)

    //    （3）循环遍历
    for(elem <- list)
      println(elem)

    //    （4）迭代器
    for(elem <- list.iterator) println(elem)

    println("-------------")
    //    （5）生成字符串
    println(list)
    println(set)
    println(list.mkString("-"))

    //    （6）是否包含
    println(list.contains(1))

  }
}
