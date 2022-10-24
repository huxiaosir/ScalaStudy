package org.joisen.chapter06

/**
 * @author : joisen 
 * @date : 18:59 2022/10/24 
 */
object Test06_Constructor {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1()
    student1.Student1()
    println("==========")
    val alice = new Student1("alice")
    println("==========")
    val bob = new Student1("bob", 21)

  }
}

class Student1() {
  // 属性
  var name: String = _
  var age: Int = _
  println("1 主构造方法")

  // 声明辅助构造方法  辅助构造器一定会调用主构造器
  def this(name: String){
    this() // 直接调用主构造器
    println("2 辅助构造方法一被调用  ")
    this.name = name
    println(s"name: $name age: $age")
  }

  def this(name: String, age: Int){
    this(name)
    println("3 辅助构造方法二被调用  ")
    this.age = age
    println(s"name: $name age: $age")
  }
  def Student1(): Unit ={
    println("普通方法。。")
  }

}
