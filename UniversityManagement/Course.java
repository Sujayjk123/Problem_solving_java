package UniversityManagement;

public class Course {
    int courseId;
    String courseName;
    Student[] students;
    Assignment[] assignments;


    public Course(int courseId, String courseName, int numberOfStudents, int numberOfAssignments) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new Student[numberOfStudents];
        this.assignments = new Assignment[numberOfAssignments];
    }

  
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println(student.name + " has been added to " + courseName);
                return;
            }
        }
        System.out.println("No more space for students in " + courseName);
    }

  
    public void addAssignment(Assignment assignment) {
        for (int i = 0; i < assignments.length; i++) {
            if (assignments[i] == null) {
                assignments[i] = assignment;
                System.out.println();
                System.out.println();
                System.out.println("Assignment " + assignment.assignmentTitle + " has been added to " + courseName);
                return;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("No space to add more assignments to " + courseName);
    }
}

