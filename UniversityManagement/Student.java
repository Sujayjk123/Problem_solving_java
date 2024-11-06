package UniversityManagement;

public class Student {
    int studentId;
    String name;
    Course[] courses;

    
    public Student(int studentId, String name, int numberOfCourses) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new Course[numberOfCourses];
    }


    public void enrollInCourse(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                System.out.println();
                System.out.println();
                System.out.println(name + " enrolled in " + course.courseName);
                return;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("No space to enroll in more courses.");
    }


    public void submitAssignment(Assignment assignment, String grade) {
        assignment.submitAssignment(grade);
    }
}
