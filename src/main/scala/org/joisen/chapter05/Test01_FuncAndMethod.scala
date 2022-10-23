package org.joisen.chapter05

/**
 * @author : joisen 
 * @date : 16:19 2022/10/23 
 */
object Test01_FuncAndMethod {
  // 定义对象的方法
  def sayHi(name: String): Unit = {
    println("Hi " + name)
  }
  def sayHello(name: String): String = {
    println("Hello " + name)
    return "Hello"
  }
  def main(args: Array[String]): Unit = {
    // 定义函数
    def sayHi(name: String): Unit = {
      println("hi " + name)
    }
    // 调用
    sayHi("alice")
    Test01_FuncAndMethod.sayHi("alice")
    // 获取方法返回值
    val result = Test01_FuncAndMethod.sayHello("joisen")
    println(result)
  }
}
