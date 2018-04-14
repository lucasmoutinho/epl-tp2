package br.unb.cic.epl.spl.height;

public privileged aspect SubHeight{
    public Integer br.unb.cic.epl.spl.sub.Sub.height() {
        if(lhs.height() > rhs.height()) return (lhs.height() + 1);
        return (rhs.height() + 1);
    }

}
