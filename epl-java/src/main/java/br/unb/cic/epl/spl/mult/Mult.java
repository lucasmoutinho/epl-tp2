package br.unb.cic.epl.spl.mult;

import br.unb.cic.epl.spl.Expression;

public class Mult implements Expression {
    private Expression lhs;
    private Expression rhs;

    public Mult(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public String print() {
        return "(" + lhs.print() + " * " + rhs.print() + ")";
    }
}
