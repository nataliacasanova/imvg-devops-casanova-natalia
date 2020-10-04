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


}