package br.unb.cic.epl

class Node (value: Char) {
  var node = value
  private var left: Node = _
  private var right: Node = _

  def referenceLeft (left: Node): Node = {
    this.left = left
    return this.left
  }

  def referenceRight (right: Node): Node = {
    this.right = right
    return this.right
  }

  def getValue(): Char = this.value

  
} 