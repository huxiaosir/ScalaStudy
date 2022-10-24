package org.joisen

/**
 * @author : joisen 
 * @date : 16:06 2022/10/24 
 */
// 包对象
package object chapter06 {
  // 定义当前包共享的属性和方法
  val commonValue = "Joisen"
  def commonMethod(): Unit = {
    println("包对象中定义的属性和方法可以作为当前包下所有class和object的共享变量，可被直接访问。。。")

  }
}
