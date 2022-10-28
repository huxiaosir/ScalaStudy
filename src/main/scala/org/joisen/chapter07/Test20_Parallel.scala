package org.joisen.chapter07

import scala.collection.immutable
import scala.collection.parallel.ParSeq

/**
 * @author : joisen 
 * @date : 11:01 2022/10/27 
 */
object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    val result: immutable.IndexedSeq[Long] = (1 to 100).map(
      x => Thread.currentThread().getId
    )
    println(result)

    val result2: ParSeq[Long] = (1 to 100).par.map(
      x => Thread.currentThread().getId
    )
    println(result2)



  }
}
