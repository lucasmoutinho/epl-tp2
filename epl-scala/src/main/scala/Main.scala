import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.SubEval
import br.unb.cic.epl.MultEval

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  val sum1 = new AddEval.Add(lit100, lit500)
  val sum2 = new AddEval.Add(lit100, sum1)
  val sum3 = new AddEval.Add(sum2, sum1)
  val sub = new SubEval.Sub(lit100, lit500)
  val mult = new MultEval.Mult(lit100, lit500)

  println(sum1.print() + " = " + sum1.eval() + "\n")

  println(sum2.print() + " = " + sum2.eval() + "\n")

  println(sum3.print() + " = " + sum3.eval() + "\n")

  println(sub.print() + " = " + sub.eval() + "\n")

  println(mult.print() + " = " + mult.eval() + "\n")
}
