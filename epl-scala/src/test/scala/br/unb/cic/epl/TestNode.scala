package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestNode extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Node"

    var nodeA: Node = _
    var nodeB: Node = _
    var nodeJS: Node = _
  
  before {
    nodeA = new Node('a')
    nodeB = new Node('b')
    nodeJS = new Node('c')
  }

  it should "return char 'a' when we call nodeA.getvalue()" in {
    nodeA.getValue() should be ('a')
  }

  it should "return nodeB when we call nodeA.refereceLeft" in {
    nodeA.referenceLeft(nodeB) should be(nodeB)
  }

  it should "return nodeJS when we call nodeA.refereceRight" in {
    nodeA.referenceRight(nodeJS) should be(nodeJS)
  }

  // it should "return 20000 when we call call Mult(Literal(100), Literal(200)).eval()" in {
  //   val mult = new MultEval.Mult(literal100, literal200)

  //   mult.eval() should be (20000)
  // }
}
