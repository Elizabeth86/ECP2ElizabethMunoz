package es.upm.miw.spai.ecp2;

import java.util.ArrayList;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el
 * denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el
 * denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de
 * la primera por denominador de la segunda) es igual al producto de medios
 * (denominador de la primera por el numerador de la segunda)
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto
 * sucede cuando el numerador y el denominador son primos entre sí
 * 
 * Reducir varias fracciones a común denominador consiste en convertirlas en
 * otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a común
 * denominador, y se suman o se restan los numeradores de las fracciones
 * equivalentes obtenidas
 * 
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que
 * tiene: Por numerador el producto de los numeradores. Por denominador el
 * producto de los denominadores.
 * 
 * La división de dos fracciones es otra fracción que tiene: Por numerador el
 * producto de los extremos. Por denominador el producto de los medios. Invertir
 * fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraction {
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

	public boolean isEquivalente(Fraction f1, Fraction f2) {
		return false;
	}
    
	public ArrayList<Fraction> reducirFraccion(ArrayList<Fraction> fracciones) {
		ArrayList<Fraction> fraccionesReducidas = new ArrayList<Fraction>();
		
		return fraccionesReducidas;
	}
	
    public Fraction suma (Fraction f){
    	Fraction[] f1 = new Fraction[2];
    	f1[0] = this;
    	f1[1] = f;
    	f1 = reducirFraccion(f1);
    	Fraction f2= new Fraction( (f1[0].getNumerator() + f1[1].getNumerator()) , f1[0].getDenominator());
    	return f2;
    }
    
}

