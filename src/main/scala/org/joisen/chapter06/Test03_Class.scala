package org.joisen.chapter06

import scala.beans.BeanProperty

/**
 * @author : joisen 
 * @date : 18:25 2022/10/24 
 */
object Test03_Class {
  def main(args: Array[String]): Unit = {
    val student = new Student()
//    println(student.name) private不能范文
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)

  }
}

// 定义一个类
class Student{
  // 定义属性

  private var name: String = "alice"
  @BeanProperty
  var age: Int = _ // 下划线作为属性初始值
  var sex: String = _
}
