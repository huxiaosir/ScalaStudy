package org.joisen.chapter06

/**
 * @author : joisen 
 * @date : 9:44 2022/10/25 
 */
// java中属性是静态绑定的，方法是动态绑定的
// scala中属性和方法都是动态绑定的
object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val stu: Person8 = new Stu8()
    println(stu.name)
    stu.hello()
  }
}

class Person8{
  val name: String = "person"
  def hello(): Unit ={
    println("hello person")
  }
}

class Stu8 extends Person8{
  override val name: String = "Stu"

  override def hello(): Unit = {
    println("Hello stu")
  }
}

