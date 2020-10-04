package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    private final String ID = "17";
    private final String NAME = "Natalia";
    private final String FAMILY_NAME = "Casanova";
    private List<Fraction> fractions;

    @BeforeEach
    public void before() {
        fractions = new ArrayList<>();
        fractions.add(new Fraction(2, 4));
        user = new User(ID, NAME, FAMILY_NAME, fractions);

    }

    @Test
    void testGetId() {
        assertEquals(ID, user.getId());
    }

    @Test
    void testGetName(){
        assertEquals(NAME,user.getName());
    }

    @Test
    void testSetName(){
        user.setName("Alicia");
        assertEquals("Alicia",user.getName());
    }

    @Test
    void testGetFamilyName(){
        assertEquals(FAMILY_NAME,user.getFamilyName());
    }

    @Test
    void testSetFamilyName(){
        user.setFamilyName("Garcia");
        assertEquals("Garcia",user.getFamilyName());
    }

    @Test
    void testEmptyUserConstructor(){
        user = new User();
        assertNull(user.getId());
        assertTrue(user.getFractions().isEmpty());
    }

    @Test
    void testSetFractions(){
        fractions.add(new Fraction(1, 1));
        user.setFractions(fractions);
    }

    @Test
    void testAddFraction(){
        Fraction fraction= new Fraction();
        user.addFraction(fraction);
    }

    @Test
    void testFullName(){
        user.setName(NAME);
        user.setFamilyName(FAMILY_NAME);
        assertEquals("Natalia Casanova",user.fullName());
    }

    @Test
    void testInitials() {
        user.setName(NAME);
        assertEquals("N.",user.initials());
    }

    @Test
    void testToString(){
        Fraction fraction = new Fraction (2,4);
        assertEquals("User{id='17', name='Natalia', familyName='Casanova', fractions=["+fraction+"]}",user.toString());
    }

}