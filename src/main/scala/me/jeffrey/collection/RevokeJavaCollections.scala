package me.jeffrey.collection

import java.util

import scala.collection.JavaConversions._

/**
  * Created by Jeffrey on 2016/12/18.
  */
class RevokeJavaCollections {
  def getList = {
    val list = new util.ArrayList[String]()
    list.add(">>> hello ")
    list.add(">>> collection ")
    list
  }

  def main(args: Array[String]) {
    val list = getList
    list.foreach(println)
  }
}
