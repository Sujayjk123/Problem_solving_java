package UniversityManagement;

public class Assignment {
    int assignmentId;
    String assignmentTitle;
    String grade;

    
    public Assignment(int assignmentId, String assignmentTitle) {
        this.assignmentId = assignmentId;
        this.assignmentTitle = assignmentTitle;
        this.grade = "Not graded yet";
    }

    public void submitAssignment(String grade) {
        this.grade = grade;
        System.out.println();
        System.out.println();
        System.out.println("Assignment submitted with grade: " + grade);
    }


    public String getGrade() {
        return grade;
    }
}

