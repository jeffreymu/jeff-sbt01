package me.jeffrey.generic

import scala.beans.BeanProperty

/**
  * Created by Jeffrey on 2016/12/18.
  */
class Student[T, S](@BeanProperty val name: T, @BeanProperty val age: S) {


}
