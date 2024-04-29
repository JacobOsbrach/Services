import java.util.HashMap;
import java.util.Map;

public class ContactService {
	 private final Map<String, Contact> Contactm; // in memory requirement
	        
	    public ContactService() {
	        Contactm = new HashMap<>();
	    }

	    public void addcontactId(Contact Contact) {
	        Contactm.put(Contact.getcontactId(), Contact);
	    }

	    public void deleteContact(String contactId) {
	        Contactm.remove(contactId);
	    }
}
