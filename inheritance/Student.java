package inheritance; 

public class Student extends Person {
    String studentId;
    String course;

    // Constructor
    public Student(String name, int age, String address, String studentId, String course) {
        super(name, age, address); // Calling the constructor of Person
        this.studentId = studentId;
        this.course = course;
    }

    // Method
    public void study() {
        System.out.println(name + " is studying " + course + ".");
    }
}
