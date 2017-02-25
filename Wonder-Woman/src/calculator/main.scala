package calculator
import calculator.tree._
import calculator.funcs._


object main {
  
  def main(args: Array[String]) {
    val exp : Tree = Sum(Mult(Var("x"),Var("x")),Sum(Const(7),Var("y")))
    val env : eval.Environment = { case "x" => 5 case "y" => 7 }
    println("Evaluation: " + eval.eval(exp, env))
    println("Derivation of y: " + derive.derive(exp, "y"))
    println("Evaluation of derivation of y: " + eval.eval(derive.derive(exp, "y"), env))
    println("Derivation of x: " + derive.derive(exp, "x"))
    println("Evaluation of derivation of x: " + eval.eval(derive.derive(exp, "x"), env))

  }
}