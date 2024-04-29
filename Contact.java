
public class Contact {

		private final String contactId; // final so it can't be changed
	    private String firstName;
	    private String lastName;
	    private long Number;
	    private String Address;

	    public Contact(String contactId, String firstName, String lastName, long Number, String Address) {
	    	this.contactId = contactId;
	    	setFirstName(firstName);
	    	setlastName(lastName);
	    	setNumber(Number);
	    	setAddress(Address);
	    }
	    
	    // getters
	    
	    public String getcontactId() { 
	    	// put this in the getter because it's a final value
	    	  if (this.contactId == null || this.contactId.length() > 10) { // ensures that the not longer then 10 and not empty
	    	        throw new IllegalStateException("Invalid Contact ID");
	    	    }
	    	    return this.contactId;
	    } 
	    
	    public String getfirstName() {
	        return firstName;
	    }

	    public String getlastName() {
	        return lastName;
	    }

	    public long getNumber() {
	        return Number;
	    }
	    public String getAddress() {
	        return Address;
	    }

	    
	    // setters for the values that can be updated, also validates values
	    
	    public void setFirstName(String firstName) {
	        if (firstName == null || firstName.length() > 10) { // ensures that the not longer then 10 and not empty
	            throw new IllegalArgumentException("This is an invalid first name");
	        }
	        this.firstName = firstName;
	    }

	    public void setlastName(String lastName) {
	        if (lastName == null || lastName.length() > 10) { // ensures that the not longer then 10 and not empty
	            throw new IllegalArgumentException("This is an invalid last name");
	        }
	        this.lastName = lastName;
	    }

	    public void setNumber(long Number) {
	        String numberString = String.valueOf(Number); // Converts long to String data type
	        if (numberString.length() == 10) { // ensures that the number is exactly 10 digits long
	            throw new IllegalArgumentException("This is an invalid Phone Number");
	        }
	        this.Number = Number;
	    }

	    public void setAddress(String Address) {
	    	if(Address == null || Address.length() > 30) { // ensures that the not longer then 30 and not empty
	    		throw new IllegalArgumentException("This is an invalid Address");
	    		}
	        this.Address = Address;
	    }

}
