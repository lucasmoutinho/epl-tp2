package br.unb.cic.epl

package object AddHeight {
  class Add(l: Height.Expression, r: Height.Expression) extends Add.GAdd with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def height(): Int = {
      
    }
}
