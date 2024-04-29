import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class ContactServiceTest {


	    @Test
	    public void testService() {
	        ContactService contactService = new ContactService();
	        Contact contact = new Contact("2567", "jacob", "osbrach", 3215011234L, "321 superstreet");


	        contactService.addcontactId(contact); // adds contact and deletes contact after
	        
	        contactService.deleteContact("2567");  // deletes
	        
	        assertNull(contact.getcontactId()); // Verifies that that the contact is deleted

	    	} // having some trouble with this

}
