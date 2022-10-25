package org.joisen.chapter06

/**
 * @author : joisen 
 * @date : 20:01 2022/10/24 
 */
object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val stu1 = new Student7("joisen", 23)
    val stu2 = new Student7("bob", 20, "bo123")
    val teacher = new Teacher
    stu1.printInfo()
    stu2.printInfo()
    teacher.printInfo()

    def personInfo(person: Person): Unit = {
      person.printInfo()
    }
    println("===================")
    val person = new Person()
    personInfo(stu1)
    personInfo(teacher)
    personInfo(person)

  }
}

// 定义一个父类
class Person(){
  var name: String = _
  var age: Int = _
  println("1. 父类的主构造器调用")
  def this(name: String, age: Int){
    this()
    println("2. 父类的辅助构造器调用")
    this.name = name
    this.age = age
  }
  def printInfo(): Unit ={
    println(s"Person: $name $age")
  }
}
// 定义子类
class Student7(name: String, age: Int) extends Person(name,age){// 父类不加（name,age）和加
  var stuNo: String = _
  println("3. 子类的主构造器调用")
  def this(name: String,age: Int,stuNo: String){
    this(name,age)
    this.stuNo = stuNo
    println("4. 子类的辅助构造器调用")
  }

  override def printInfo(): Unit = {
    println(s"Student: $name $age $stuNo")
  }
}

class Teacher extends Person {
  override def printInfo(): Unit = {
    println(s"Teacher: ")
  }
}