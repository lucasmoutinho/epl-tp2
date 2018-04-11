package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestMult extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Mult expression"

  var literal10: Eval.Literal = _
  var literal2: Eval.Literal = _
  var literalN2: Eval.Literal = _
  var literal0: Eval.Literal = _

  before {
    literal10 = new Core.Literal(10) with Eval.Literal
    literal2 = new Core.Literal(2) with Eval.Literal
    literalN2 = new Core.Literal(-2) with Eval.Literal
    literal0 = new Core.Literal(0) with Eval.Literal
  }

  it should "return String (10 * 2) when we call Mult(Literal(10), Literal(2).print())" in {
    val mult = new MultEval.Mult(literal10, literal2)
  
    mult.print() should be ("(10 * 2)")
  }

  it should "return 20 when we call call Mult(Literal(10), Literal(2)).eval()" in {
    val mult = new MultEval.Mult(literal10, literal2)

    mult.eval() should be (20)
  }

    it should "return -4 when we call call Mult(Literal(-2), Literal(2)).eval()" in {
      val mult = new MultEval.Mult(literalN2, literal2)

      mult.eval() should be (-4)
  }

    it should "return 0 when we call call Mult(Literal(-2), Literal(0)).eval()" in {
      val mult = new MultEval.Mult(literalN2, literal0)

      mult.eval() should be (0)
  }

    it should "return 0 when we call call Mult(Literal(0), Literal(0)).eval()" in {
      val mult = new MultEval.Mult(literal0, literal0)

      mult.eval() should be (0)
  }

    it should "return 4 when we call call Mult(Literal(-2), Literal(-2)).eval()" in {
      val mult = new MultEval.Mult(literalN2, literalN2)

      mult.eval() should be (4)
  }
}
