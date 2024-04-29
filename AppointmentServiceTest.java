import static org.junit.jupiter.api.Assertions.assertNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class AppointmentServiceTest {

    @Test
    public void testService() {
    	
        AppointmentServices AppointmentService = new AppointmentServices();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date appointmentDate = null;
		try {
			appointmentDate = dateFormat.parse("04/05/2025");
		} catch (ParseException exception) {
			exception.printStackTrace();
		} // Parses the date to change string to Date type
		
        Appointment Appointment = new Appointment("456789", appointmentDate, "the appointment description");


        AppointmentService.addAppointmentId(Appointment); // adds contact and deletes contact after
        
        AppointmentService.deleteAppointment("456789");  // deletes
        
        assertNull(Appointment.getAppointmentId()); // Verifies that that the contact is deleted

    	}


}
