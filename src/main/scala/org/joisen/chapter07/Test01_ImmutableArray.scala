package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 17:12 2022/10/25 
 */
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //创建数组
    val arr:Array[Int] = new Array[Int](5)
    // 另一种创建方式
    val arr2 = Array(1,2,6,4,3,5)

    // 访问数组中的元素
    for(i <- arr2.indices){
      println(arr2(i))
    }
    println("========================")
    // 遍历所有元素
    for(elem <- arr2){
      println(elem)
    }
    println("========================")
    // 迭代器
    val iter = arr2.iterator
    while (iter.hasNext)
      println(iter.next())

    println("========================")
    // 调用foreach方法
    arr2.foreach((elem: Int) => println(elem))
    arr2.foreach(println)

    println("========================")
    // 添加元素
    val array = arr2.:+(13) // + 在后面表示要添加的元素加在最后面
    println(arr2.mkString("--"))
    println(array.mkString("--"))
    val array2 = array.+:(21) // + 在前面表示要添加的元素加在最前面
    println(array.mkString("--"))
    println(array2.mkString("--"))

    val array3 = 12 +: 14 +: array2 :+ 34 :+ 31 // 当不用 . 来进行添加元素时，需要注意
    println(array3.mkString("-="))



  }

}
