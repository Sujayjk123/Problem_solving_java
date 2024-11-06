package Overriding;

public class Nurse extends HealthcareProfessional {
    String shiftTiming;
    public Nurse(String name, int id, String department, String shiftTiming) {
        super(name, id, department); 
        this.shiftTiming = shiftTiming;
    }
    public void treatPatient(){
        System.out.println(name + " is providing basic care during the " + shiftTiming + " shift.");
    }
    public void checkVitals(){
        System.out.println(name + " is checking the patient's vital signs.");
    }
}
