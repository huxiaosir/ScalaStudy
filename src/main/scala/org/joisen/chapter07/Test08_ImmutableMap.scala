package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 14:54 2022/10/26 
 */
object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    // 创建map
    val map1: Map[String,Int] = Map("a" -> 12, "b" -> 21, "c" -> 31)
    println(map1)
    println(map1.getClass)

    // 遍历
    map1.foreach(println)
    map1.foreach( (kv: (String, Int)) => println(kv) )
    println("------------")

    // 取map中所有的key 或者 value
    for (key <- map1.keys){
      println(s"$key ---> ${map1.get(key)}")

    }
    println("------------")
    // 访问某一个key的value
    println(map1.get("a").get)
    println(map1.getOrElse("a",0)) // 当没有该key时 返回0  而不是抛出异常
    println(map1("a"))
    println(map1.get("c"))


  }
}
