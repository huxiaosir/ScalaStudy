package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 9:21 2022/10/27 
 */
object Test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    //  reduce：归约简化
    println(list.reduce((a: Int,b: Int)=>a+b))
    println(list.reduceLeft((a: Int,b: Int)=>a+b))
    println(list.reduceRight((a: Int,b: Int)=>a+b))

    println("=================")

    val list2 = List(3,4,5,8,10)
    println(list2.reduce(_ - _))
    println(list2.reduceLeft(_ - _))
    println(list2.reduceRight(_ - _)) // (3 - (4 - (4 - (8 - 10))))

    println("=================")

    // fold
    println(list.fold(10)(_ + _)) //第一个参数 10 表示聚合的初始状态，fold对list中的每个元素都与10进行递归聚合操作
    println(list.foldLeft(10)(_ - _))
    println(list2.foldRight(11)(_ - _)) //  3 - (4 - (5 - (8 - (10 - 11))))





  }
}
