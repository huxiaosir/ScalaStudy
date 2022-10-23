package org.joisen.chapter01

/**
 * @author : joisen 
 * @date : 16:24 2022/10/22 
 */
// 在参数前面加上var/val 说明该类含有该属性，不加则只是相当于构造方法的参数，而该参数不是类的属性。
class Student(name:String,var age:Int) {
  def printInfo():Unit = {
    println(name+"  "+age+"  "+Student.school)
  }
}
// 引入伴生对象
object Student{
  val school = "PeKing U"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 10)
    alice.printInfo()
  }
}
