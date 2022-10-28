package org.joisen.chapter08

/**
 * @author : joisen 
 * @date : 12:30 2022/10/27 
 */
object Test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    // 1 在变量声明时匹配
    val (x,y) = (10,"hello")
    println(s"x: $x,  y: $y")

    val List(first,second,_*) = List(23,15,6,54)
    println(s"first: $first, second: $second")

    val fir::sec::rest = List(23,15,6,54)
    println(s"first:$fir,second:$sec, rest: $rest")

    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    println("-=-=-=-=-=-=-=-1=-=-=-=-=-=-=-")
    //特殊的模式匹配 1 打印元组第一个元素
    for (elem <- Array(("a", 1), ("b", 2), ("c", 3))) {
      println(elem._1)
    }
    println("-=-=-=-=-=-=-=-2=-=-=-=-=-=-=-")
    for ((word,count) <- Array(("a", 1), ("b", 2), ("c", 3))) {
      println(word)
    }
    println("-=-=-=-=-=-=-=-=3-=-=-=-=-=-=-")
    for ((word,_) <- Array(("a", 1), ("b", 2), ("c", 3))) {
      println(word)
    }
    println("-=-=-=-=-=-=-=-4=-=-=-=-=-=-=-")
    for (("a",count) <- Array(("a", 1), ("b", 2), ("c", 3))) {
      println(count)
    }
    println("-=-=-=-=-=-=-=-5=-=-=-=-=-=-=-")
    println("--------------")
    //特殊的模式匹配 2 给元组元素命名
    var (id,name,age): (Int, String, Int) = (100, "zs", 20)
    println((id,name,age))
    println("-------6-------")
    //特殊的模式匹配 3 遍历集合中的元组，给 count * 2
    var list: List[(String, Int)] = List(("a", 1), ("b", 2), ("c", 3))
    //println(list.map(t => (t._1, t._2 * 2)))
    println(
      list.map{
        case (word,count)=>(word,count*2)
      }
    )
    println("-=-=-=-=-=-=-7=-=-=-=-=-=-=-=-")
    var list1 = List(("a", ("a", 1)), ("b", ("b", 2)), ("c", ("c", 3)))
    println(
      list1.map{
        case (groupkey,(word,count))=>(word,count*2)
      }
    )


  }
}
