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

  }
}
