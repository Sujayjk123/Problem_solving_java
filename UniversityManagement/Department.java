package UniversityManagement;
public class Department {
    int departmentId;
    String departmentName;
    Course[] courses;


    public Department(int departmentId, String departmentName, int numberOfCourses) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.courses = new Course[numberOfCourses];
    }

   
    public void addCourse(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                System.out.println();
                System.out.println();
                System.out.println("Course " + course.courseName + " added to " + departmentName + " department.");
                return;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("No more space for courses in " + departmentName + " department.");
    }
}
