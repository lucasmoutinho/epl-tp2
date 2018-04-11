package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestAdd extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Add expression"

  var literal0: Eval.Literal = _
  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _
  var literalN100: Eval.Literal = _

  before {
    literal0 = new Core.Literal(0) with Eval.Literal
    literal100 = new Core.Literal(100) with Eval.Literal
    literal200 = new Core.Literal(200) with Eval.Literal
    literalN100 = new Core.Literal(-100) with Eval.Literal
  }

  it should "return String (100 + 200) when we call Add(Literal(100), Literal(200).print())" in {
    val add = new AddEval.Add(literal100, literal200)
  
    add.print() should be ("(100 + 200)")
  }

  it should "return 300 when we call Add(Literal(100), Literal(200)).eval()" in {
    val add = new AddEval.Add(literal100, literal200)

    add.eval() should be (300)
  }

  it should "return 100 when we call Add(Literal(-100), Literal(200)).eval()" in {
    val add = new AddEval.Add(literalN100, literal200)

    add.eval() should be (100)
  }

  it should "return 0 when we call Add(Literak(-100), Literal(100)).eval()" in {
    val add = new AddEval.Add(literalN100, literal100)

    add.eval() should be (0)
  }

  it should "return -200 when we call Add(Literal(-100), Literal(-100)).eval()" in {
    val add = new AddEval.Add(literalN100, literalN100) 
    add.eval() should be (-200)
  }

  it should "return 0 when we call Add(Litera(0), Literal(0)).eval()" in {
    val add = new AddEval.Add(literal0, literal0)
    add.eval() should be (0)
  }

    it should "return 100 when we call Add(Litera(0), Literal(100)).eval()" in {
    val add = new AddEval.Add(literal0, literal100)
    add.eval() should be (100)
  }
}
