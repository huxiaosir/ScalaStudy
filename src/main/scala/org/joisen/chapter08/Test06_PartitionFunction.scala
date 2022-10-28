package org.joisen.chapter08

/**
 * @author : joisen 
 * @date : 15:34 2022/10/27 
 */
object Test06_PartitionFunction {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(("a",12),("b",35),("c",27),("a",13))
    // map转换，实现key不变，value 2倍
    val newList = list.map( tuple => (tuple._1, tuple._2 * 2) )

    // 用模式匹配对元组元素赋值，实现功能
    val newList2 = list.map(
      tuple => {
        tuple match {
          case (word, count ) => (word, count*2)
        }
      }
    )
    // 用模式匹配对元组元素赋值，实现功能 (简写)
    val newList3 = list.map {
      case (word, count) => (word, count * 2)
    }
    println(newList)
    println(newList2)
    println(newList3)

    // 偏函数应用  求绝对值
    // 对输入数据分为不同的情形 + 、-、 0
    val positiveAbs: PartialFunction[Int,Int] = {
      case x if x > 0 => x
    }
    val negativeAbs: PartialFunction[Int,Int] = {
      case x if x < 0 => -x
    }
    val zeroAbs: PartialFunction[Int,Int] = {
      case 0 => 0
    }

    def abs(x: Int): Int = (positiveAbs orElse negativeAbs orElse zeroAbs)(x)

    println(abs(1))
    println(abs(0))
    println(abs(-1))



  }
}
