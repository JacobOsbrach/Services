import java.util.HashMap;
import java.util.Map;

public class AppointmentServices {

	private final Map<String, Appointment> Appointmentm; // in memory requirement
    
    public AppointmentServices() {
        Appointmentm = new HashMap<>();
    }

    public void addAppointmentId(Appointment Appointment) {
        Appointmentm.put(Appointment.getAppointmentId(), Appointment);
    }

    public void deleteAppointment(String AppointmentServiceId) {
        Appointmentm.remove(AppointmentServiceId);
    }
}
