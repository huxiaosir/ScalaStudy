package org.joisen.chapter07

/**
 * @author : joisen 
 * @date : 9:48 2022/10/27 
 */
object Test17_CommonWordCount {
  def main(args: Array[String]): Unit = {
    val stringList: List[String] = List("Hello Scala Hbase kafka",
      "Hello Scala Hbase", "Hello Scala", "Hello","Hello world"
      ,"spark from scala","flink"
    )
    // 对字符串进行切分，得到一个打散所有单词的列表
//    val wordList1: List[Array[String]] = stringList.map(_.split(" "))
//    val wordList2: List[String] = wordList1.flatten
//    println(wordList2)
    val wordList = stringList.flatMap(_.split(" "))
    println(wordList)
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

    // 相同的单词进行分组
    val groupMap: Map[String, List[String]] = wordList.groupBy(word => word)
    println(groupMap)

    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

    // 对分组之后的list取长度， 得到每个单词的个数
    val countMap: Map[String, Int] = groupMap.map(kv => (kv._1, kv._2.length))
    println(countMap)
    println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

    // 将map转换为list， 并且排序取前3
    val sortList: List[(String, Int)] = countMap.toList
      .sortWith(_._2 > _._2) // 按list中每个元素的第二个字段进行排序
      .take(3) // 取前3个
    println(sortList)




  }
}
