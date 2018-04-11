package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestHeight extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

    behavior of "An Height of expression"

    var literal100: Height.Literal = _
    var literal200: Height.Literal = _
    var literal2: Height.Literal = _
    var literal5: Height.Literal = _

    before {
        literal100 = new Core.Literal(100) with Height.Literal
        literal200 = new Core.Literal(200) with Height.Literal
        literal2 = new Core.Literal(2) with Height.Literal
        literal5 = new Core.Literal(5) with Height.Literal
    }

    it should "return 3 when we call add.height" in {                                                                                                             
        val add1 = new AddHeight.Add(literal100,literal200)
        val add2 = new AddHeight.Add(literal2,literal5)
        val add = new AddHeight.Add(add1,add2)
        println(add1.height())
        println(add2.height())
        println(add.height())
        add.height() should be (3)
    }
}