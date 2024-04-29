import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;

class TaskServiceTestone {


	    @Test
	    public void testService() {
	        TaskService TaskService = new TaskService();
	        Task Task = new Task("987654", "jacob", "my really cool description");


	        TaskService.addTaskId(Task); // adds contact and deletes contact after
	        
	        TaskService.deleteTask("987654");  // deletes
	        
	        assertNull(Task.getTaskId()); // Verifies that that the contact is deleted

	    	}

}
