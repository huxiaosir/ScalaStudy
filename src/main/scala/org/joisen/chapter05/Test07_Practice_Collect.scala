package org.joisen.chapter05

/**
 * @author : joisen 
 * @date : 10:32 2022/10/24 
 */
object Test07_Practice_Collect {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(12, 45, 75, 98)
    // 对数组进行处理，将操作抽象出来，出来完毕之后的结果返回一个新的数组
    def arrayOperation(array: Array[Int], op: Int=>Int): Array[Int] = {
      for(elem <- array) yield  op(elem) // 遍历数组中的元素，并对每个元素进行op操作
    }

    // 定义 op 函数
    def op_addOne(elem: Int): Int = {
      elem + 1
    }

    // 调用函数
    val newArr: Array[Int] = arrayOperation(arr,op_addOne)
    for(ele <- newArr) yield println(ele)
    println(newArr.mkString(","))
    println("====================")

    // 传入匿名函数，实现数组元素翻倍
    val newArr2 = arrayOperation(arr, elem => elem * 2)
    println(newArr2.mkString(",,"))
  }
}
