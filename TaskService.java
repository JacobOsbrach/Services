import java.util.HashMap;
import java.util.Map;

public class TaskService {
	 private final Map<String, Task> Taskm; // in memory requirement
	        
	    public TaskService() {
	        Taskm = new HashMap<>();
	    }

	    public void addTaskId(Task Task) {
	        Taskm.put(Task.getTaskId(), Task);
	    }

	    public void deleteTask(String TaskServiceId) {
	        Taskm.remove(TaskServiceId);
	    }
}
