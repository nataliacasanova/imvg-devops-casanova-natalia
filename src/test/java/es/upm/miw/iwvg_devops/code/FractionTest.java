package es.upm.miw.iwvg_devops.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    private Fraction fraction;

    private final int NUMERATOR = 2;
    private final int DENOMINATOR = 2;

    @BeforeEach
    void before() {
        fraction = new Fraction(NUMERATOR, DENOMINATOR);
    }

    @Test
    void testEmptyFractionConstructor() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testGetNumerator() {
        assertEquals(NUMERATOR, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(DENOMINATOR, fraction.getDenominator());
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(4);
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(8);
        assertEquals(8, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        double decimal = (double) NUMERATOR / DENOMINATOR;
        assertEquals(decimal, fraction.decimal());
    }

    @Test
    void testToString() {
        assertEquals("Fraction{numerator=2, denominator=2}", fraction.toString());
    }


    @Test
    void testIsProper(){
        fraction.setNumerator(2);
        fraction.setDenominator(5);
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImProper(){
        fraction.setNumerator(5);
        fraction.setDenominator(2);
        assertTrue(fraction.isImProper());
    }

    @Test
    void testIsEquivalent(){
        Fraction a= new Fraction (3,4);
        a.isEquivalent(this.fraction);
    }


    @Test
    void testAdd(){
        Fraction a= new Fraction(NUMERATOR,DENOMINATOR);
        fraction.add(a);
    }

    @Test
    void testDivide(){
        Fraction a= new Fraction(5,7);
        fraction.divide(a);
    }

    @Test
    void testMultiply(){
        Fraction a= new Fraction(6,5);
        fraction.multiply(a);
    }
}