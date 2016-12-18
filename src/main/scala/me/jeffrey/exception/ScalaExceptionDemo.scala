package me.jeffrey.exception

import java.io.{File, IOException}

/**
  * Created by Jeffrey on 2016/12/18.
  */
class ScalaExceptionDemo extends App {
  val file: File = new File("a.txt")
  if (!file.exists) {
    try {
      file.createNewFile
    }
    catch {
      case e: IOException => {
        e.printStackTrace
      }
    }
  }

}
