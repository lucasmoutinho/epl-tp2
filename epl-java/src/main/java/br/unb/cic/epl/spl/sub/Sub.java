package br.unb.cic.epl.spl.sub;

import br.unb.cic.epl.spl.Expression;

public class Sub implements Expression {
    private Expression lhs;
    private Expression rhs;

    public Sub(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public String print() {
        return "(" + lhs.print() + " - " + rhs.print() + ")";
    }
}
