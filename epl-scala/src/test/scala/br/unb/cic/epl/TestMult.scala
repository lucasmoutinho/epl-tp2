package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestMult extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Mult expression"

  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _

  var literal300: Height.Literal = _
  var literal400: Height.Literal = _
  var literal500: Height.Literal = _
  var literal600: Height.Literal = _
  var literal700: Height.Literal = _
  var literal800: Height.Literal = _

  before {
    literal100 = new Core.Literal(100) with Eval.Literal
    literal200 = new Core.Literal(200) with Eval.Literal

    literal300 = new Core.Literal(300) with Height.Literal
    literal400 = new Core.Literal(400) with Height.Literal
    literal500 = new Core.Literal(500) with Height.Literal
    literal600 = new Core.Literal(600) with Height.Literal
    literal700 = new Core.Literal(700) with Height.Literal
    literal800 = new Core.Literal(800) with Height.Literal
  }

  it should "return String (100 * 200) when we call Mult(Literal(100), Literal(200).print())" in {
    val mult = new MultEval.Mult(literal100, literal200)
  
    mult.print() should be ("(100 * 200)")
  }

  it should "return 20000 when we call call Mult(Literal(100), Literal(200)).eval()" in {
    val mult = new MultEval.Mult(literal100, literal200)

    mult.eval() should be (20000)
  }

  it should "return 1 when we call literal300.height" in {                                                                                                             
    literal300.height() should be (1)
  }

  it should "return 3 when we call Mult.height" in {                                                                                                             
    val mult1 = new MultHeight.Mult(literal300,literal400)
    val mult2 = new MultHeight.Mult(literal500,literal600)
    val mult = new MultHeight.Mult(mult1,mult2)
    mult.height() should be (3)
  }

  it should "return 5 when we call Mult.height" in {                                                                                                             
    val mult1 = new MultHeight.Mult(literal300,literal400)
    val mult2 = new MultHeight.Mult(literal500,literal600)
    val mult3 = new MultHeight.Mult(mult1,mult2)
    val mult4 = new MultHeight.Mult(mult3, literal700)
    val mult = new MultHeight.Mult(mult4, literal800)
    mult.height() should be (5)
  }
}
