package Overriding;

public class Doctor extends HealthcareProfessional{
    String specialization;
    public Doctor(String name, int id, String department, String specialization) {
        super(name, id, department); 
        this.specialization = specialization;
    }
    @Override
    public void treatPatient(){
        System.out.println(this.name + " is providing patient care in "+ specialization);
    }
    public void writePrescription(){
        System.out.println(name + " is writing a prescription for the patient.");
    }
}
