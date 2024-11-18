public class UpcastingDowncastingDemo {

    public static void main(String[] args) {
        
        System.out.println("Primitive Upcasting:");
        int numberOfBooks = 5;
        double booksPrice = numberOfBooks; // Upcasting
        System.out.println("Books Price (int to double): " + booksPrice);

        byte age = 25;
        int personAge = age; // Upcasting
        System.out.println("Person Age (byte to int): " + personAge);

        char grade = 'A';
        int gradeAscii = grade; // Upcasting
        System.out.println("Grade ASCII (char to int): " + gradeAscii);

        short distance = 150;
        long longDistance = distance; // Upcasting
        System.out.println("Long Distance (short to long): " + longDistance);

       
        System.out.println("\nPrimitive Downcasting:");
        double itemPrice = 25.99;
        int roundedPrice = (int) itemPrice; // Downcasting
        System.out.println("Rounded Price (double to int): " + roundedPrice);

        int totalMarks = 130;
        byte marks = (byte) totalMarks; // Downcasting
        System.out.println("Marks (int to byte): " + marks);

        long population = 32768L;
        short reducedPopulation = (short) population; // Downcasting
        System.out.println("Reduced Population (long to short): " + reducedPopulation);

        float distanceInKm = 23.45f;
        int roundedDistance = (int) distanceInKm; // Downcasting
        System.out.println("Rounded Distance (float to int): " + roundedDistance);

       
        System.out.println("\nInheritance Upcasting and Downcasting:");

       
        Vehicle myVehicle = new Car(); // Upcasting
        myVehicle.start(); 
        

      
        
        Car myCar = (Car) myVehicle; // Downcasting
        myCar.drive(); 
        

        
        Employee myEmployee = new Manager(); // Upcasting
        myEmployee.work();
        

        
        
        Manager myManager = (Manager) myEmployee; // Downcasting
        myManager.conductMeeting(); 
        
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}


class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    void conductMeeting() {
        System.out.println("Manager is conducting a meeting");
    }
}
