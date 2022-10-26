package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 16:21 2022/10/26 
 */
object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 5, -3, 4, 2, -7, 6)
    val list2 = List(("a",5),("b",1),("c",8),("d",2),("e",-3))
    //（1）求和
    println(list.sum)
    //（2）求乘积
    println(list.product)
    //（3）最大值
    println("-------------")
    println(list.max)
    println(list2.max) // 按 tuple的第一个元素大小进行排序
    println(list2.maxBy( (tuple: (String,Int)) => tuple._2 )) // 按tuple的第二个元素进行排序

    println("-------------")
    //（4）最小值
    println(list.min)
    //（5）排序
    println(list.sorted)
    // （5.1）按照元素大小排序
    println(list.sortBy(x => x))
    // （5.2）按照元素的绝对值大小排序
    println(list.sortBy(x => x.abs))
    // （5.3）按元素大小升序排序
    println(list.sortWith((x, y) => x < y))
    // （5.4）按元素大小降序排序
    println(list.sortWith((x, y) => x > y))

  }
}
