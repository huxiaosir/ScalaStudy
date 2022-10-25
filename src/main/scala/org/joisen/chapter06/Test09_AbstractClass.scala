package org.joisen.chapter06

/**
 * @author : joisen 
 * @date : 10:06 2022/10/25 
 */
object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student = new Student9
    student.eat()
  }
}
// 定义抽象类
abstract class Person9{
  // 非抽象属性
  val name: String = "person"
  var add: String = "nc"
  // 抽象属性
  var age: Int
  // 非抽象方法
  def eat(): Unit ={
    println("person eat")
  }
  // 抽象方法
  def sleep():Unit
}

// 定义具体的实现子类
// 子类不能重写父类的可变属性  即用var定义的属性
class Student9 extends Person9{
  var age: Int = 18

  override def sleep(): Unit = {
    println("student sleep")
  }

  // 重写非抽象属性和方法
    override val name: String = "student"
  // 重写父类 var定义的非抽象属性
    add = "bj"

  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }
}
