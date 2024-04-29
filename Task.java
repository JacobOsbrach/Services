
public class Task {

		private final String TaskId; // final so it can't be changed
	    private String Name;
	    private String Description;

	    public Task(String TaskId, String Name, String Description) {
	    	this.TaskId = TaskId;
	    	setName(Name);
	    	setDescription(Description);
	    }
	    
	    // getters
	    
	    public String getTaskId() { 
	    	// put this in the getter because it's a final value
	    	  if (this.TaskId == null || this.TaskId.length() > 10) { // ensures that the not longer then 10 and not empty
	    	        throw new IllegalStateException("Invalid Task ID");
	    	    }
	    	    return this.TaskId;
	    } 
	    
	    public String getName() {
	        return Name;
	    }

	    public String getDescription() {
	        return Description;
	    }


	    
	    // setters for the values that can be updated, also validates values
	    
	    public void setName(String Name) {
	        if (Name == null || Name.length() > 20) { // ensures that the not longer then 20 and not empty
	            throw new IllegalArgumentException("This is an invalid name");
	        }
	        this.Name = Name;
	    }

	    public void setDescription(String Description) {
	        if (Description == null || Description.length() > 50) { // ensures that the not longer then 50 and not empty
	            throw new IllegalArgumentException("This is an invalid description");
	        }
	        this.Description = Description;
	    }

}
