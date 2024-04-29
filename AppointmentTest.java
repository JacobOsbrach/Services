import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class AppointmentTest {

    @Test
    void test() {
    	
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date appointmentDate = null;
		try {
			appointmentDate = dateFormat.parse("04/05/2025");
		} catch (ParseException exception) {
			exception.printStackTrace();
		} // Parses the date to change string to Date type
		
    	Appointment Appointment = new Appointment("987654321234", appointmentDate, "my really cool description");

        assertEquals("987654321234", Appointment.getAppointmentId());
        assertEquals("4/5/2024", Appointment.getDate());
        assertEquals("my really cool description", Appointment.getDescription());
        
        assertNull(Appointment.getAppointmentId()); // if Assertion fails, it worked
    }

    @Test
    void testLongDate() {

    	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date appointmentDate = null;
    	try {
    		appointmentDate = dateFormat.parse("04/05/2022");
    	} catch (ParseException exception) {
    		exception.printStackTrace();
    	} // Parses the date to change string to Date type
            
            Appointment Appointment = new Appointment("1234", appointmentDate, "description");
            
            
            assertEquals(appointmentDate, Appointment.getDate()); // Tests if the date has already passed, if so, it should error
           
       
    }


@Test
void testLongDesc() {
	
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    Date appointmentDate = null;
	try {
		appointmentDate = dateFormat.parse("04/05/2025");
	} catch (ParseException exception) {
		exception.printStackTrace();
	} // Parses the date to change string to Date type
	
	Appointment Appointment = new Appointment("1234", appointmentDate, "my really cool description and i'm going to make it really long so it fails and I can see what happends");

	Appointment.setDescription("my really cool description and i'm going to make it really long so it fails and I can see what happends");
	 // Tests if the description is too long

}

}
