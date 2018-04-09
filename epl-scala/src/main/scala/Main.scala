import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.SubEval
import br.unb.cic.epl.MultEval

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  val sum = new AddEval.Add(lit100, lit500) 
  val sub = new SubEval.Sub(lit100, lit500)
  val mult = new MultEval.Mult(lit100, lit500)

  println(sum.print() + " = " + sum.eval() + "\n")

  println(sub.print() + " = " + sub.eval() + "\n")

  println(mult.print() + " = " + mult.eval() + "\n")
}
