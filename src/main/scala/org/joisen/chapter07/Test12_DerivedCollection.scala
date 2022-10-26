package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 16:01 2022/10/26 
 */
object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
    val list2: List[Int] = List(4, 5, 6, 7, 8, 9, 10)
    //（1）获取集合的头
    println("1::"+list1.head)
    //（2）获取集合的尾（不是头的就是尾）
    println("2::"+list1.tail)
    //（3）集合最后一个数据
    println("3::"+list1.last)
    //（4）集合初始数据（不包含最后一个）
    println("4::"+list1.init)
    //（5）反转
    println("5::"+list1.reverse)
    //（6）取前（后）n 个元素
    println("6-1::"+list1.take(3))
    println("6-2::"+list1.takeRight(3))
    //（7）去掉前（后）n 个元素
    println("7::"+list1.drop(3))
    println("7::"+list1.dropRight(3))
    //（8）并集
    println("8::"+list1.union(list2))
    //（9）交集
    println("9::"+list1.intersect(list2))
    //（10）差集
    println("10::"+list1.diff(list2))
    //（11）拉链 注:如果两个集合的元素个数不相等，那么会将同等数量的数据进行拉链，多余的数据省略不用
    println("11::"+list1.zip(list2))
    //（12）滑窗
    list1.sliding(2, 5).foreach(println) // 第一个参数为窗口大小，第二个参数为滑动步长
  }
}
