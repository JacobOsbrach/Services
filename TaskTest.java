import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

class TaskTest {

    @Test
    void test() {
    	Task Task = new Task("987654", "jacob", "my really cool description");

        assertEquals("987654", Task.getTaskId());
        assertEquals("jacob", Task.getName());
        assertEquals("my really cool description", Task.getDescription());
        
        assertNull(Task.getTaskId()); // if Assertion fails, it worked
    }

    @Test
    void testLongName() {
    	Task Task = new Task("12345678901", "jacob", "my really cool description");

    	Task.setName("12345678901"); // Tests if the name is too long, it should error
    }


@Test
void testLongDesc() {
	Task Task = new Task("1234", "jacob", "my really cool description and i'm going to make it really long so it fails and I can see what happends");

	Task.setDescription("my really cool description and i'm going to make it really long so it fails and I can see what happends");
	 // Tests if the description is too long
}
}

