package org.joisen.chapter06

/**
 * @author : joisen 
 * @date : 10:35 2022/10/25 
 */
object Test11_Object {
  def main(args: Array[String]): Unit = {
//    val s11 = new Student11("alice", 13)
//    s11.printInfo()
    val student = Student11.newStudent("kale",12)
    student.printInfo()
    val student2 = Student11("kale",12) // 实际是调用了apply方法
    student2.printInfo()

  }
}
//定义类
class Student11 private(val name: String,val age: Int){
  def printInfo(): Unit ={
    println(s"student11: name=${name}, age=$age schoole=${Student11.school}")
  }
}
// 定义伴生对象
object Student11{
  val school: String = "PKU"
  //  定义一个类的对象实例的创建方法
  def newStudent(name:String,age:Int):Student11 = new Student11(name,age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}
