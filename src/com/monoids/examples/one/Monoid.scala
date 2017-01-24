package com.monoids.examples.one

/**
  * Created by ALEJANDRO on 23/01/2017.
  */
trait Monoid[A] {

  def op(a1:A,a2:A):A

  def zero:A

}
