package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestSub extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Sub expression"

  var literal000: Eval.Literal = _
  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _
  var literal100N: Eval.Literal = _
  var literal200N: Eval.Literal = _

  var literal300: Height.Literal = _
  var literal400: Height.Literal = _
  var literal500: Height.Literal = _
  var literal600: Height.Literal = _
  var literal700: Height.Literal = _
  var literal800: Height.Literal = _

  before {
    literal000 = new Core.Literal(0) with Eval.Literal
    literal100 = new Core.Literal(100) with Eval.Literal
    literal200 = new Core.Literal(200) with Eval.Literal
    literal100N = new Core.Literal(-100) with Eval.Literal
    literal200N = new Core.Literal(-200) with Eval.Literal

    literal300 = new Core.Literal(300) with Height.Literal
    literal400 = new Core.Literal(400) with Height.Literal
    literal500 = new Core.Literal(500) with Height.Literal
    literal600 = new Core.Literal(600) with Height.Literal
    literal700 = new Core.Literal(700) with Height.Literal
    literal800 = new Core.Literal(800) with Height.Literal
  }

  it should "return String (100 - 200) when we call Sub(Literal(100), Literal(200)).print()" in {
    val sub = new SubEval.Sub(literal100, literal200)
  
    sub.print() should be ("(100 - 200)")
  }

  it should "return -100 when we call call Sub(Literal(100), Literal(200)).eval()" in {
    val sub = new SubEval.Sub(literal100, literal200)

    sub.eval() should be (-100)
  }

  it should "return 0 when we call call Sub(Literal(000), Literal(000)).eval()" in {
    val sub = new SubEval.Sub(literal000, literal000)

    sub.eval() should be (0)
  }

  it should "return -100 when we call call Sub(Literal(000), Literal(100)).eval()" in {
    val sub = new SubEval.Sub(literal000, literal100)

    sub.eval() should be (-100)
  }

  it should "return 100 when we call call Sub(Literal(000), Literal(100N)).eval()" in {
    val sub = new SubEval.Sub(literal000, literal100N)

    sub.eval() should be (100)
  }

  it should "return -100 when we call call Sub(Literal(200N), Literal(100N)).eval()" in {
    val sub = new SubEval.Sub(literal200N, literal100N)

    sub.eval() should be (-100)
  }

  it should "return -300 when we call call Sub(Literal(100N), Literal(200)).eval()" in {
    val sub = new SubEval.Sub(literal100N, literal200)

    sub.eval() should be (-300)
  }


  it should "return 1 when we call literal300.height" in {                                                                                                             
    literal300.height() should be (1)
  }

  it should "return 3 when we call Sub.height" in {                                                                                                             
    val sub1 = new SubHeight.Sub(literal300,literal400)
    val sub2 = new SubHeight.Sub(literal500,literal600)
    val sub = new SubHeight.Sub(sub1,sub2)
    sub.height() should be (3)
  }

  it should "return 5 when we call Sub.height" in {                                                                                                             
    val sub1 = new SubHeight.Sub(literal300,literal400)
    val sub2 = new SubHeight.Sub(literal500,literal600)
    val sub3 = new SubHeight.Sub(sub1, sub2)
    val sub4 = new SubHeight.Sub(sub3, literal700)
    val sub = new SubHeight.Sub(sub4, literal800)
    sub.height() should be (5)
  }
}
