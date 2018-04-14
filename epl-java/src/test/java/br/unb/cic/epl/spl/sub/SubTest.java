package br.unb.cic.epl.spl.sub;

import junit.framework.TestCase;

public class SubTest extends TestCase {
    public void testAdd() {
        br.unb.cic.epl.spl.Literal lit1 = new br.unb.cic.epl.spl.Literal(100);
        br.unb.cic.epl.spl.Literal lit2 = new br.unb.cic.epl.spl.Literal(200);
        br.unb.cic.epl.spl.sub.Sub sub1 = new br.unb.cic.epl.spl.sub.Sub(lit1,lit2);
        br.unb.cic.epl.spl.sub.Sub sub2 = new br.unb.cic.epl.spl.sub.Sub(lit1,sub1);
        assertEquals(new String("(100 - (100 - 200))"), sub2.print());
        assertEquals(new Integer(200), sub2.eval());
        assertEquals(new Integer(3), sub2.height());
    }
}
