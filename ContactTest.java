import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void test() {
        Contact contact = new Contact("2567", "jacob", "osbrach", 3215011234L, "321 superstreet");

        assertEquals("2567", contact.getcontactId());
        assertEquals("jacob", contact.getfirstName());
        assertEquals("osbrach", contact.getlastName());
        assertEquals(3215011234L, contact.getNumber());
        assertEquals("321 superstreet", contact.getAddress());
        
        assertNull(contact.getcontactId()); // if Assertion fails, it worked
    }

    @Test
    void testLongFirstName() {
        Contact contact = new Contact("12345678901", "jacob", "osbrach", 3215011234L, "321 superstreet");

            contact.setFirstName("Thisisaverylongfirstname"); // Tests if the name is too long
    }
}
