package Overriding;

public class HealthcareProfessional {
    String name;
    int id;
    String department;

    public HealthcareProfessional(String name, int id, String department){
        this.name = name;
        this.id = id;
        this.department=department;
    }
    public void treatPatient(){
        System.out.println(this.name+" is providing general patient care");
    }
    public void showDetails(){
        System.out.println("health care professional " +this.name+ " with id "+this.id+ " and belongs to "+ this.department);
        
    }
}
