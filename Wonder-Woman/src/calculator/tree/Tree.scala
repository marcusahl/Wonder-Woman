package calculator.tree

abstract class Tree
case class Sum(l: Tree, r: Tree) extends Tree
case class Mult(l: Tree, r: Tree) extends Tree
case class Var(n: String) extends Tree
case class Const(x: Int) extends Tree