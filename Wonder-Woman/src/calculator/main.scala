package calculator
import calculator.tree._
import calculator.funcs._


object main {
  type Environment = String => Int

  
  def main(args: Array[String]) {
    val exp : Tree = Sum(Mult(Var("x"),Var("x")),Sum(Const(7),Var("y")))
    val env : Environment = { case "x" => 5 case "y" => 7 }
    println("Evaluation: " + eval(exp, env))
    println("Derivation: " + derive(exp, "y"))

  }
}