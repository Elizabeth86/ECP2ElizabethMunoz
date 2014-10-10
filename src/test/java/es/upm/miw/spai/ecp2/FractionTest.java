package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction fn;

    @Before 
    public void before() { 
        fn = new Fraction(4, 5); 
    }
    
    @Test
    public void testIsEquivalente() {
    	fn = new Fraction();
    	Fraction f1 = new Fraction(1, 2);
    	Fraction f2 = new Fraction(2, 4);
        assertTrue(fn.isEquivalente(f1, f2));
    }
    
    @Test
    public void testMCD() {
    	fn = new Fraction();
    	assertEquals(2, fn.MCD(6, 4));
    }
    
}
