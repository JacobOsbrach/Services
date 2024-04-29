import java.util.Date;

public class Appointment {


    private final String AppointmentId; // final so it can't be changed
    private Date Date; // Changed data type from int to Date
    private String Description;

    public Appointment(String AppointmentId, Date Date, String Description) {
        this.AppointmentId = AppointmentId;
        setDate(Date);
        setDescription(Description);
    }

    // getters

    public String getAppointmentId() {
        // put this in the getter because it's a final value
        if (this.AppointmentId == null || this.AppointmentId.length() > 10) { // ensures that the not longer then 10 and not empty
            throw new IllegalStateException("Invalid Appointment ID");
        }
        return this.AppointmentId;
    }

    public Date getDate() {
        return Date;
    }

    public String getDescription() {
        return Description;
    }


    // setters for the values that can be updated, also validates values

    public void setDate(Date Date) {
        if (Date.before(new Date())) { // ensures that the date is not in the past
            throw new IllegalArgumentException("Appointment date cannot be in the past"); 
        }
        this.Date = Date;
    }

    public void setDescription(String Description) {
        if (Description == null || Description.length() > 50) { // ensures that its not longer then 50 and not empty
            throw new IllegalArgumentException("This is an invalid description");
        }
        this.Description = Description;
    }
}
