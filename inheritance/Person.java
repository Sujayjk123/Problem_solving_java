package inheritance;
public class Person {
    String name;
    int age;
    String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method
    public void introduce() {
        System.out.println("Hi, I am " + name + ", " + age + " years old, and I live at " + address + ".");
    }
}
