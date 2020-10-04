package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindUserFamilyNameByUserNameDistinct() {
        assertEquals(List.of("Torres"), new Searches().findUserFamilyNameByUserNameDistinct("Paula")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFractionNumeratorByFamilyName() {
        assertEquals(List.of(2, 4, 0, 1, 1), new Searches().findFractionNumeratorByUserFamilyName("Torres")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFamilyNameByFractionDenominator() {
        assertEquals(List.of("López", "Torres"), new Searches().findUserFamilyNameByFractionDenominator(2)
                .collect(Collectors.toList()));
    }

    void testFindUserIdByAnyProperFraction() {
    }

    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        assertEquals(List.of("Fernandez", "Blanco", "López", "Blanco",
                "Torres"), new Searches().findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindHighestFraction() {
        Fraction fraction = new Searches().findHighestFraction();
        assertEquals(2, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());

    }

    @Test
    void testFindUserFamilyNameByAllSignFractionDistinct() {
        assertEquals(List.of("Blanco", "López"), new Searches().findUserFamilyNameByAllNegativeSignFractionDistinct()
                .collect(Collectors.toList()));
    }

    void testFindDecimalFractionByUserName() {
    }

    void testFindDecimalFractionBySignFraction() {
    }

    @Test
    void testFindFractionDivisionByUserId() {
        Fraction fraction = new Searches().findFractionDivisionByUserId("1");
        assertEquals(0,fraction.getNumerator());
        assertEquals(2,fraction.getDenominator());
    }

    void testFindFractionSubtractionByUserName() {
    }

    void testFindFractionMultiplicationByUserFamilyName() {
    }
}