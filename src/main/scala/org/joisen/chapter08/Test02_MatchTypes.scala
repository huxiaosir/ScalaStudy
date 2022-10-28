package org.joisen.chapter08

/**
 * @author : joisen 
 * @date : 11:16 2022/10/27 
 */
object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    // 匹配常量
    def describeConst(x: Any): String = x match{
      case 1 => "Num one"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "char +"
      case _ => ""
    }
    println(describeConst("hello"))
    println(describeConst('+'))
    println(describeConst(0.3))


    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    // 匹配类型
    def describeType(x: Any): String = x match{
      case i: Int => "Int " + i
      case s: String => "String " + s
      case list: List[String] => "List " + list
      case array: Array[Int] => "Array[Int] " + array.mkString(",")
      case a => "SomeThing else: " + a

    }
    println(describeType(32))
    println(describeType("joisen"))
    println(describeType(List("joisen","hi")))
    println(describeType(List(2,3)))
    println(describeType(Array(21,31)))
    println(describeType(Array("jujuboom","hello")))
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    // 匹配数组
    for (arr <- List(
      Array(0),
      Array(1,0),
      Array(0,1,0),
      Array(1,1,0),
      Array(2,3,5,7),
      Array("hi",20,10)
    )){
      val result = arr match{
        case Array(0) => "0"
        case Array(1,0) => "Array(1,0)"
        case Array(x,y) => "Array: " + x + "," + y
        case Array(0, _*) => "以0开头的数组"
        case Array(x,1,z) => "mid is 1"
        case _ => "other"
      }
      println(result)
    }
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    // 匹配list
    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1,
      0, 0), List(88))) {
      val result = list match {
        case List(0) => "0" //匹配 List(0)
        case List(x, y) => x + "," + y //匹配有两个元素的 List
        case List(0, _*) => "0 ..."
        case _ => "something else"
      }
      println(result)
    }
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    // 匹配list 2
    val list = List(1,2,5,6,8)
    list match{
      case first :: second :: rest => println(s"first: $first, second: $second, rest: $rest")
      case _ => println("Other")
    }

    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

    // 匹配元组
    for(tuple <- List(
      (0,1),
      (0,0),
      (0,1,0),
      (0,1,1),
      ("hello",21,23,54,true)
    )){
      val result = tuple match{
        case (a,b) => "" + a + ", " + b
        case (0, _) => "(0, _)"
        case (a,b,0) => "(a,b,0)"
        case (a,1,_) => "(a,1,_)"
        case _ => "other"
      }
      println(result)
    }




  }
}
