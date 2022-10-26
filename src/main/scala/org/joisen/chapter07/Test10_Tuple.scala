package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 15:24 2022/10/26 
 */
object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    // 创建元组
    val tuple = ("hello",'a',10,true)
    println(tuple)
    println("------------")

    // 访问数据
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)

    println(tuple.productElement(1))
    println("------------")

    // 遍历
    for(elem <- tuple.productIterator)
      println(elem)

    println("------------")

    // 嵌套元组
    val mulTuple = (12,0.3,"hi",(2.1,"scala"),true)
    println(mulTuple)
    println(mulTuple._4._2)



  }
}
