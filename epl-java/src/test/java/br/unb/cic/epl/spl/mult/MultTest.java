package br.unb.cic.epl.spl.mult;

import junit.framework.TestCase;

public class MultTest extends TestCase {
    public void testAdd() {
        br.unb.cic.epl.spl.Literal lit1 = new br.unb.cic.epl.spl.Literal(100);
        br.unb.cic.epl.spl.Literal lit2 = new br.unb.cic.epl.spl.Literal(200);
        br.unb.cic.epl.spl.mult.Mult mult1 = new br.unb.cic.epl.spl.mult.Mult(lit1,lit2);
        br.unb.cic.epl.spl.mult.Mult mult2 = new br.unb.cic.epl.spl.mult.Mult(lit1,mult1);
        assertEquals(new String("(100 * (100 * 200))"), mult2.print());
        assertEquals(new Integer(2000000), mult2.eval());
        assertEquals(new Integer(3), mult2.height());
    }
}
