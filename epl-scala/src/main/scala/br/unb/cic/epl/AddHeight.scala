package br.unb.cic.epl

package object AddHeight {
  class Add(l: Height.Expression, r: Height.Expression) extends Add.GAdd with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r
    private var tamanho = 0

    override def height(exp: Core.Expression): Int = {
      if(exp.lhs.isInstanceOf[Core.Literal]){
        return 1
      }

      var tamanhoLeft = height(exp.lhs)
      var tamanhoRight = height(exp.rhs)
      if(tamanhoLeft > tamanhoRight){
        return tamanhoLeft + 1
      }
      return tamanhoRight + 1
    }
  }
}
