package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestHeight extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

    behavior of "An Height of expression"

    var literal300: Height.Literal = _
    var literal400: Height.Literal = _
    var literal500: Height.Literal = _
    var literal600: Height.Literal = _
    var literal700: Height.Literal = _
    var literal800: Height.Literal = _

    before {
        literal300 = new Core.Literal(300) with Height.Literal
        literal400 = new Core.Literal(400) with Height.Literal
        literal500 = new Core.Literal(500) with Height.Literal
        literal600 = new Core.Literal(600) with Height.Literal
        literal700 = new Core.Literal(700) with Height.Literal
        literal800 = new Core.Literal(800) with Height.Literal
    }

    it should "return 4 when we call sub.height" in {                                                                                                             
        val add1 = new AddHeight.Add(literal300,literal400)
        val add2 = new AddHeight.Add(literal500,literal600)
        val sub1 = new SubHeight.Sub(add1,literal700)
        val mult1 = new MultHeight.Mult(add2,literal800)
        val sub = new SubHeight.Sub(mult1,sub1)
        sub.height() should be (4)
    }
}