package org.joisen.chapter08

/**
 * @author : joisen 
 * @date : 15:16 2022/10/27 
 */
object Test04_MatchObject {
  def main(args: Array[String]): Unit = {
    val student = new Student("bob",13)
    // 针对对象实例的内容进行匹配
    val result = student match{
      case Student("bob", 12) => "Bob 12"
      case _ => "Else"
    }
    println(result)


  }
}

class Student(val name: String, val age: Int)

object Student{
  def apply(name: String, age: Int): Student = new Student(name, age)
  // 必须实现一个unapply方法，用来对对象属性进行拆解
  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null){
      None
    } else{
      Some((student.name,student.age))
    }
  }
}
