package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {
    
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

}
