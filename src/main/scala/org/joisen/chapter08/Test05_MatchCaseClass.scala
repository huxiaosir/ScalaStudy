package org.joisen.chapter08

/**
 * @author : joisen 
 * @date : 15:25 2022/10/27 
 */
object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student1("bob",13)
    // 针对对象实例的内容进行匹配
    val result = student match{
      case Student1("bob", 12) => "Bob 12"
      case _ => "Else"
    }
    println(result)


  }
}

// 定义样例类
case class Student1(name: String, age: Int)

