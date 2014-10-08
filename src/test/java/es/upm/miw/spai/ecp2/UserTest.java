package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    
    private User user;
    
    @Before
    public void before() {
        user = new User(1, "Jane", "Doe");
    }
    
    @Test
    public void testUser() {
        assertEquals(1, user.getNumber());
        assertEquals("Jane", user.getName());
        assertEquals("Doe", user.getFamilyName());
    }
    
    @Test
    public void testFullName() {
        assertEquals("Jane Doe", user.fullName());
    }
    
    @Test
    public void testInitials() {
        assertEquals("J.", user.initials());
    }
    
    @Test
    public void testNombreMayusculas() {
    	user.nombreMayusculas();
        assertEquals("JANE", user.getName());
    }

}
