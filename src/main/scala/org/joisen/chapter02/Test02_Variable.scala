package org.joisen.chapter02

import org.joisen.chapter01.Student

/**
 * @author : joisen 
 * @date : 16:15 2022/10/22 
 */
/**
 * 变量和常量
 */
object Test02_Variable {
  def main(args: Array[String]): Unit = {
    // 声明一个变量的通用语法
    var a:Int = 10
    // 1) 声明变量时，类型可以省略，编译器自动推导，即类型推导
    var a1 = 10
    val b1 = 10
    // 2) 类型确定后，就不能更改，说明scala是强数据类型语言
    var a2 = 15 //a2类型为Int
//    a2 = "hello"  仅支持自动类型转换
    // 3) 变量声明时，必须要有初始值

    // 4) 在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可以改变，val则不行。


    var alice = new Student("alice", 20)
    alice = new Student("Alice",20)
    alice = null
    val bob = new Student("bob",22)
    bob.age = 23
    bob.printInfo()


  }
}
