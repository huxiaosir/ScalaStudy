package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 10:03 2022/10/27 
 */
object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val tupleList: List[(String,Int)] = List(
      ("Hello Scala Hbase kafka",1),
      ("Hello Scala Hbase", 2),
      ("Hello Scala",3),
      ("Hello",2),
      ("Hello world",1),
      ("spark from scala",3),
      ("flink",2)
    )

    // 思路一： 直接展开为普通版本
    val newStringList: List[String] = tupleList.map(
      kv => {
       ( kv._1.trim + " ") * kv._2
      }
    )
    println(newStringList)
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    // 接下来与普通版本一样
    val wordCountList: List[(String,Int)] = newStringList
      .flatMap(_.split(" ")) // 空格分词
      .groupBy(word => word) // 按照单词分组
      .map(kv => (kv._1, kv._2.size)) // 统计出每个单词的个数
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)
    println(wordCountList)
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

    // 思路2：直接基于预统计结果进行转换
    // 1 : 将字符串打散为单词，并结合对应的个数包装成二元组
    val preCountList: List[(String, Int)] = tupleList.flatMap(
      tuple => {
        val strings: Array[String] = tuple._1.split(" ")
        strings.map(word => (word, tuple._2))
      }
    )
    println(preCountList)
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    // 2 对二元组按照单词进行分组
    val preCountMap: Map[String, List[(String,Int)]] = preCountList.groupBy(_._1)
    println(preCountMap)
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

    // 3 叠加每个单词预统计的个数值
    val countMap: Map[String, Int] = preCountMap.mapValues(
      tupleList => tupleList.map(_._2).sum
    )
    println(countMap)
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
    // 转换成list 排序取前3
    val countList = countMap.toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(countList)













  }
}
