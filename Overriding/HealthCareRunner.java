package Overriding;

public class HealthCareRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith", 101, "Cardiology", "Cardiology");
        doctor.showDetails();
        doctor.treatPatient();
        doctor.writePrescription();
        System.out.println();

       
        Nurse nurse = new Nurse("Nurse Mary", 102, "Emergency", "Night");
        nurse.showDetails();
        nurse.treatPatient();
        nurse.checkVitals();
        System.out.println();

       
        Surgeon surgeon = new Surgeon("Dr. Adams", 103, "Surgery", "Orthopedic Surgery", 120);
        surgeon.showDetails();
        surgeon.treatPatient();
        surgeon.performSurgery();
    }
}
