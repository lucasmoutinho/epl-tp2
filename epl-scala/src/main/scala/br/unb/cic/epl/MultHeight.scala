package br.unb.cic.epl

package object MultHeight {
  class Mult(l: Height.Expression, r: Height.Expression) extends Mult.GMult with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def height(): Int = {
      if(lhs.height() > rhs.height()){
        return lhs.height() + 1
      }
      else{
        return rhs.height() + 1
      }
    }
  }
}
