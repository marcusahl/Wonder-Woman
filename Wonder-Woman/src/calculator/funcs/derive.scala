package calculator.funcs
import calculator.tree._
import calculator.funcs._

object derive {

  def derive(t: Tree, v: String): Tree = t match{
    case Sum(l, r) => Sum(derive(l, v), derive(r, v))
    case Mult(l, r) => Sum(Mult(derive(l, v), r), Mult(derive(r, v), l))
    case Var(n) if (v == n) => Const(1)
    case _ => Const(0) 
    
  }
}