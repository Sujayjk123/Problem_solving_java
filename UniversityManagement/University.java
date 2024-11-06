package UniversityManagement;

public class University {
    String universityName;
    Department[] departments;


    public University(String universityName, int numberOfDepartments) {
        this.universityName = universityName;
        this.departments = new Department[numberOfDepartments];
    }

    
    public void addDepartment(Department department) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) {
                departments[i] = department;
                System.out.println();
                System.out.println();
                System.out.println(department.departmentName + " department added to " + universityName + ".");
                return;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("No more space for departments in " + universityName);
    }
}

