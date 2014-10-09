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
    
    private Fraction fr;
    
    @Test
    public void testConstructor() {
        assertEquals(1, fr.getNumerator());
        assertEquals(1, fr.getDenominator());
    }
    
    @Test
    public void testConstructor2() {
        fr = new Fraction (6,5);
        assertEquals(6, fr.getNumerator());
        assertEquals(5, fr.getDenominator());
    }
    
    @Test
    public void testdecimal() {
        fr = new Fraction (12,4);
        assertEquals(3, fr.decimal(), 10e-5);
    }
    
    @Test
    public void testReducirFraccion() {
        fr = new Fraction (12,4);
        Fraction[] f1 = new Fraction[2];
    	f1[0] = new Fraction(2,4);
    	f1[1] = new Fraction(1,4);
    	Fraction[] f = new Fraction[2];
    	f[0] = new Fraction(1,2);
    	f[1] = new Fraction(1,4);
        assertArrayEquals(f1, fr.reducirFraccion(f));
    }

    @Test
    public void testsumaFraccion() {
        Fraction f1 = new Fraction (3,5);
        Fraction f2 = new Fraction (2,3);
        fr = fr.sumaFraccion(f1, f2);
        assertEquals(19, fr.getNumerator(), 10e-5);
        assertEquals(15, fr.getDenominator(), 10e-5);
        
    }

}

