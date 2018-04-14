package br.unb.cic.epl.spl;

import java.util.ArrayList;
import br.unb.cic.epl.spl.add.Add;
import br.unb.cic.epl.spl.mult.Mult;
import br.unb.cic.epl.spl.sub.Sub;

import java.util.List;

public class Main {
	private static Main instance; 
	
	private Main() {} 
	
	public static Main instance() {
		if(instance == null) {
			instance = new Main();
		}
		return instance; 
	}
	public List<Expression> expressions = new ArrayList<Expression>();
	
	public void createExpressions() {

		Literal Lit100 = new Literal(100);
		Literal Lit200 = new Literal(200);
		Add add1 = new Add(Lit100,Lit200);
		Add add2 = new Add(add1,Lit200);
		Sub sub1 = new Sub(Lit100,Lit200);
		Mult mult1 = new Mult(add2,sub1);

		expressions.add(Lit100);
		expressions.add(Lit200);
		expressions.add(add1);
		expressions.add(add2);
		expressions.add(sub1);
		expressions.add(mult1);
	}

	
	public static void main(String args[]) {
		instance().createExpressions();
		
		for(Expression e: instance().expressions) {
			System.out.println("-----");
			System.out.println("Expression:"+e.print());
			System.out.println("Valor da expression:"+e.eval());
			System.out.println("Altura da expression:"+e.height());
			System.out.println("-----");
		}
	}
}
