package me.jeffrey.exception

/**
  * Created by Jeffrey on 2016/12/18.
  */
class ScalaThrower {
  @throws(classOf[Exception])
  def exceptionThrower {
    throw new Exception("Scala Exception!")
  }
}
