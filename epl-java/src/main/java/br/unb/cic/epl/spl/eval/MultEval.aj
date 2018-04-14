package br.unb.cic.epl.spl.eval;

public privileged aspect MultEval {
    public Integer br.unb.cic.epl.spl.mult.Mult.eval() {
        return lhs.eval() * rhs.eval();
    }

}
