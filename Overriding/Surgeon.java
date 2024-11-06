package Overriding;

public class Surgeon extends Doctor{
    int surgeryCount;
    public Surgeon(String name, int id, String department, String specialization, int surgeryCount) {
        super(name, id, department, specialization); 
        this.surgeryCount = surgeryCount;
    }
    public void treatPatient(){
        System.out.println(name + " is performing a surgery. Total surgeries performed: " + surgeryCount);
    }
    public void performSurgery(){
        System.out.println(name + " is performing a complex surgical procedure.");
    }
}
