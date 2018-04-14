import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.SubEval
import br.unb.cic.epl.MultEval
import br.unb.cic.epl.Height
import br.unb.cic.epl.AddHeight
import br.unb.cic.epl.SubHeight
import br.unb.cic.epl.MultHeight

object Main extends App {
  val hlit100 = new Core.Literal(100) with Height.Literal
  val hlit200 = new Core.Literal(200) with Height.Literal

  val hadd1 = new AddHeight.Add(hlit100,hlit200)
  val hadd2 = new AddHeight.Add(hadd1,hlit100)
  val hsub1 = new SubHeight.Sub(hlit100,hlit200)
  val hmult1 = new MultHeight.Mult(hadd2,hsub1)

  val elit100 = new Core.Literal(100) with Eval.Literal
  val elit200 = new Core.Literal(200) with Eval.Literal

  val eadd1 = new AddEval.Add(elit100,elit200)
  val eadd2 = new AddEval.Add(eadd1,elit100)
  val esub1 = new SubEval.Sub(elit100,elit200)
  val emult1 = new MultEval.Mult(eadd2,esub1)

  val listaE: List[Eval.Expression] = List(elit100,elit200,eadd1,eadd2,esub1,emult1)
  val listaH: List[Height.Expression] = List(hlit100,hlit200,hadd1,hadd2,hsub1,hmult1)

  println()
  println("Expressions with Eval Feature")
  println("---------------------")
  println()

  listaE.foreach{ e =>
    println("Expression: "+ e.print())
    println("Height: "+ e.eval())
    println("----")
  }

  println()
  println("---------------------")
  println()
  
  println("Expressions with Height Feature")
  println("---------------------")
  println()
  
  listaH.foreach{ e =>
    println("Expression: "+ e.print())
    println("Height: "+ e.height())
    println("----")
  }

  println()
  println("---------------------")
}
