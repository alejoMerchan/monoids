package com.monoids.examples.one

/**
  * Ejemplo de un String monoid.
  *
  * Created by ALEJANDRO on 23/01/2017.
  */
object MainMonoid extends App {

  val stringMonoid = new Monoid[String] {

    override def op(a1: String, a2: String): String = a1 + a2

    val zero = Nil

  }

  def listMonoid[A] = new Monoid[List[A]] {

    override def op(a1: List[A], a2: List[A]): List[A] = a1 ++ a2

    val zero = Nil

  }



}
