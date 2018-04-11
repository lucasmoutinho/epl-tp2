package br.unb.cic.epl

package object AddHeight {
  class Add(l: Height.Expression, r: Height.Expression) extends Add.GAdd with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r
    override def height(): Int = {
      if(lhs.height > rhs.height) {
        return lhs.height + 1
      }else{
        rhs.height + 1
      }
    }
  }
}
