package br.unb.cic.epl.spl.height;

public aspect HeightTest {
    public void br.unb.cic.epl.spl.LiteralTest.testHeight() {
        br.unb.cic.epl.spl.Literal lit1 = new br.unb.cic.epl.spl.Literal(1000);
        br.unb.cic.epl.spl.Literal lit2 = new br.unb.cic.epl.spl.Literal(2000);
        br.unb.cic.epl.spl.add.Add add1 = new br.unb.cic.epl.spl.add.Add(lit1,lit2);
        br.unb.cic.epl.spl.add.Add add2 = new br.unb.cic.epl.spl.add.Add(lit1,add1);
        br.unb.cic.epl.spl.sub.Sub sub1 = new br.unb.cic.epl.spl.sub.Sub(lit1,lit2);
        br.unb.cic.epl.spl.mult.Mult mult1 = new br.unb.cic.epl.spl.mult.Mult(sub1,add2);
        assertEquals(new Integer(1), lit1.height());
        assertEquals(new Integer(4), mult1.height());
    }
}
