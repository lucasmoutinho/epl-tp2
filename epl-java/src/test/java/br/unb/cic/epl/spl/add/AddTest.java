package br.unb.cic.epl.spl.add;

import junit.framework.TestCase;

public class AddTest extends TestCase {
    public void testAdd() {
        br.unb.cic.epl.spl.Literal lit1 = new br.unb.cic.epl.spl.Literal(100);
        br.unb.cic.epl.spl.Literal lit2 = new br.unb.cic.epl.spl.Literal(200);
        br.unb.cic.epl.spl.add.Add add1 = new br.unb.cic.epl.spl.add.Add(lit1,lit2);
        br.unb.cic.epl.spl.add.Add add2 = new br.unb.cic.epl.spl.add.Add(lit1,add1);
        assertEquals(new String("(100 + (100 + 200))"), add2.print());
        assertEquals(new Integer(400), add2.eval());
        assertEquals(new Integer(3), add2.height());
    }
}
