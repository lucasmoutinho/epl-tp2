package br.unb.cic.epl.spl.height;

public privileged aspect MultHeight{
    public Integer br.unb.cic.epl.spl.mult.Mult.height() {
        if(lhs.height() > rhs.height()) return (lhs.height() + 1);
        return (rhs.height() + 1);
    }

}
