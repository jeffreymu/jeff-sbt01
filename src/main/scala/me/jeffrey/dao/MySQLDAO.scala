package me.jeffrey.dao

/**
  * Created by Jeffrey on 2016/12/18.
  */
trait MySQLDAO {
  def delete(id: String): Boolean = {
    true
  }

  def add(o: Any): Boolean

  def update(o: Any): Int

  def query(id: String): List[Any]
}
