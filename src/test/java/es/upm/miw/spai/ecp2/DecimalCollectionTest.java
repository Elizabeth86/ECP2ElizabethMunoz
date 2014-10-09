package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

//import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection lista;
    
    @Before
    public void before() {
       lista = new DecimalCollection();
    }
    
    @Test
    public void testAdd() {
        lista.add (5.0);
        assertEquals(1, lista.size());
    }
    
    @Test
    public void testSize() {
        assertEquals(0, lista.size());
    }
    
    @Test
    public void testSum() {
        lista.add (5.3);
        lista.add (6.2);
        assertEquals(11.5, lista.sum(), 10e-5);
    }
    
    @Test
    public void testHigher() {
        lista.add (7.4);
        lista.add (8.2);
        lista.add (11.6);
        assertEquals(11.6, lista.higher(), 10e-5);
    }
    
    @Test
    public void testMenorColeccion() {
        lista.add (7.4);
        lista.add (8.2);
        lista.add (11.6);
        assertEquals(7.4, lista.menorColeccion(), 10e-5);
    }

}