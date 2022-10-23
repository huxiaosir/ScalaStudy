package org.joisen.chapter01

/**
 * @author : joisen 
 * @date : 12:46 2022/10/22 
 */
/**
 * object: 关键字，声明一个单例对象（伴生对象）
 */
object HelloWorld {
  /**
   * main 方法：从外部可以直接调用执行的方法
   * def 方法名称（参数名称：参数类型）：返回值类型={方法体}
   * @param args
   */
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    System.out.println("hello scala from java!")
  }
}
