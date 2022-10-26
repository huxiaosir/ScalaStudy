package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 10:50 2022/10/26 
 */
object Test03_MulArray {
  def main(args: Array[String]): Unit = {
    // 创建二维数组
    val array: Array[Array[Int]] = Array.ofDim[Int](2, 3)
    // 遍历
    for (i <- 0 until array.length; j <- 0 until array(i).length){
      array(i)(j) = i*4 + j
      println(array(i)(j))
    }
    println("=======")
    for (i <- array.indices; j <- array(i).indices){
      print(array(i)(j) + "\t")
      if(j == array(i).length-1) println()
    }
    println("=======")
    array.foreach(line => line.foreach(println))
    array.foreach(_.foreach(println))



  }
}
