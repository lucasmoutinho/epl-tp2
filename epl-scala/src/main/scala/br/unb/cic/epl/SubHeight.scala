package br.unb.cic.epl

package object SubHeight {
  class Sub(l: Height.Expression, r: Height.Expression) extends Sub.GSub with Height.Expression {
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
