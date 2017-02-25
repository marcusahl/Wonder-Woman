package calculator.funcs
import calculator.tree._

object eval {
  type Environment = String => Int
  
  def eval(t: Tree, env: Environment): Int = t match{
    case Mult(l, r) => eval(l, env) * eval(r, env)
    case Sum(l, r) => eval(l, env) + eval(r,env)
    case Var(n) => env(n)
    case Const(x) => x
    
  }
}