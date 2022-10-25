package org.joisen.chapter06

/**
 * @author : joisen 
 * @date : 10:26 2022/10/25 
 */
object Test10_AnnoymousClass {
  def main(args: Array[String]): Unit = {
    val person: Person10 = new Person10 {
      override var name: String = "ale"

      override def eat(): Unit = println("person eat")
    }
    println(person.name)
    person.eat()
  }
}

// 定义抽象类
abstract class Person10{
  var name: String
  def eat():Unit

}