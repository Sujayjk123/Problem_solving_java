package inheritance; 
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Student student = new Student("John", 21, "123 Main St.", "S12345", "Computer Science");
        student.introduce(); 
        student.study(); 
    }
}
