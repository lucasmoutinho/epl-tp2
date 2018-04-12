package br.unb.cic.epl.spl.eval;

public privileged aspect AddEval {
	public Integer br.unb.cic.epl.spl.add.Add.eval() {
		return lhs.eval() + rhs.eval();
	}

}
