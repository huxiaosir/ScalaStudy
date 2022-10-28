package org.joisen.chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * @author : joisen 
 * @date : 10:53 2022/10/27 
 */
object Test19_Queue {
  def main(args: Array[String]): Unit = {
    // 创建一个可变队列
    val queue: mutable.Queue[String] = mutable.Queue[String]()
    queue.enqueue("a","b","c")
    println(queue)
    println(queue.dequeue())
    println(queue)
    println(queue.dequeue())
    println(queue)
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    // 不可变队列
    val queue2:Queue[String] = Queue("a","b","d")
    val queue3 = queue2.enqueue("e")
    println(queue2)
    println(queue3)


  }
}
