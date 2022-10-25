package org.joisen.chapter06

/**
 * @author : joisen 
 * @date : 10:47 2022/10/25 
 */
object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    student1.printInfo()
    val student2 = Student12.getInstance()
    student2.printInfo()

    println(student1)
    println(student2)
  }
}
//定义类
class Student12 private(val name: String,val age: Int){
  def printInfo(): Unit ={
    println(s"student11: name=${name}, age=$age schoole=${Student11.school}")
  }
}
// 饿汉式
//object Student12{
//  private val student: Student12 = new Student12("bob",19)
//  def getInstance():Student12 = {
//    student
//  }
//}

// 懒汉式
object Student12{
  private var student: Student12 = _
  def getInstance(): Student12 = {
    if (student == null){
      // 如果没有对象实例的话，就创建一个
      student = new Student12("bob",19)
    }
    student
  }
}

