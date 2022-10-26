package org.joisen.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @author : joisen 
 * @date : 10:18 2022/10/26 
 */
object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    // 创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    var arr2 = ArrayBuffer(1,2,4,6,8,3)

    println(arr1)
    println(arr2) // 普通array直接输出地址

    // 访问元素
    println(arr2(0))
    arr2(1) = 101
    println(arr2(1))

    println("============---------=============")
    // 添加元素
    var newArr1 = arr1 :+ 15 // 这种添加元素的方法主要针对不可变集合，可变集合也可采用该方法
    println(newArr1)

    val newArr2 = arr1 += 12
    println(arr1)
    println(newArr2)
    println(arr1 == newArr2)
    newArr2 += 102
    println(arr1)
    println(newArr2)

    arr1.append(123)
    arr1.prepend(213)
    println(arr1)
    println(newArr2)

    // 删除元素
    arr1.remove(3)
    println(arr1)
    arr1 -= 12
    println(arr1)

    // 将可变数组转换为不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(0,8,5,2,5,7)
    val newArr: Array[Int] = arr.toArray
    println(newArr.mkString(". "))
    println(arr)

    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
    // 不可变数组转换尾可变数组
    val buffer:mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr)




  }

}
