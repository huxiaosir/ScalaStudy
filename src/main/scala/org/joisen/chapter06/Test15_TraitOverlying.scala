package org.joisen.chapter06

/**
 * @author : joisen 
 * @date : 15:29 2022/10/25 
 */
object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15
    student.increase()
    println("===================")
    // 钻石问题特征叠加
    val myFootBall = new MyFootBall
    println(myFootBall.describe())
  }
}
// 定义特质
trait Knowledge15{
  var amount: Int = 0
  def increase(): Unit = {
    println("knowledge increased")
  }
}
trait Talent15{
  def singing(): Unit
  def dancing(): Unit
  def increase(): Unit = {
    println("talent increased")
  }
}

class Student15 extends Person13 with Knowledge15 with Talent15{
  override def singing(): Unit = println("singing")

  override def dancing(): Unit = println("dancing")

  override def increase(): Unit = {
//    super.increase() // 调用最后一个含有该方法的父类或特质
    super[Person13].increase()
  }
}

trait Ball{
  def describe():String = {
    "ball"
  }
}

trait Color extends Ball{
  var color:String = "red"
  override def describe(): String = color + "-" + super.describe()
}

trait Category extends Ball{
  var category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

class MyFootBall extends Category with Color{
//  override def describe(): String = "my ball is " + super.describe()
  override def describe(): String = "my ball is " + super[Category].describe()
}
