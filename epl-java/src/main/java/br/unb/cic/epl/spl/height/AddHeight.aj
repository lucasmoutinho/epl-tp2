package br.unb.cic.epl.spl.height;

public privileged aspect AddHeight{
    public Integer br.unb.cic.epl.spl.add.Add.height() {
        if(lhs.height() > rhs.height()) return (lhs.height() + 1);
        return (rhs.height() + 1);
    }

}
