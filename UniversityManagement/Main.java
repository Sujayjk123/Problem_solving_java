package UniversityManagement;

public class Main {
    public static void main(String[] args) {
        
        Assignment assignment1 = new Assignment(1, "Math Assignment");
        Assignment assignment2 = new Assignment(2, "Science Assignment");

        Course course1 = new Course(101, "Mathematics", 30, 2);
        Course course2 = new Course(102, "Science", 30, 2);

       
        course1.addAssignment(assignment1);
        course2.addAssignment(assignment2);

    
        Student student1 = new Student(1, "Alice", 2);
        Student student2 = new Student(2, "Bob", 2);

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

 
        student1.submitAssignment(assignment1, "A");
        student2.submitAssignment(assignment2, "B");


        Department dept1 = new Department(1, "Mathematics", 2);
        Department dept2 = new Department(2, "Science", 2);


        dept1.addCourse(course1);
        dept2.addCourse(course2);


        University university = new University("XYZ University", 2);

      
        university.addDepartment(dept1);
        university.addDepartment(dept2);
    }
}

