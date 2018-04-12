package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestLiteral extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "A Literal"

  var literal000: br.unb.cic.epl.Core.Literal = _
  var literal100: br.unb.cic.epl.Core.Literal = _ 
  var literal100N: br.unb.cic.epl.Core.Literal = _

  before {
    literal000 = new Core.Literal(0)
    literal100 = new Core.Literal(100)
    literal100N = new Core.Literal(-100)
  }

  it should "return string 0 when we call literal000.print()" in {
    literal000.print() should be ("0")
  }

  it should "return string 100 when we call literal100.print()" in {
    literal100.print() should be ("100")
  }

  it should "return string -100 when we call literal100N.print()" in {
    literal100N.print() should be ("-100")
  }

  it should "return Integer 500 when we call literal1000.eval()" in {
    val literal500 = new Core.Literal(500) with Eval.Literal
    literal500.eval() should be (500)
  }

  it should "return Integer 0 when we call literal0.eval()" in {
    val literal0 = new Core.Literal(0) with Eval.Literal
    literal0.eval() should be (0)
  }
  

}
