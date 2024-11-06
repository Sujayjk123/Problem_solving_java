package inheritance;
public class Appliance {
    String brand;
    int power;

  
    Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

 
    void turnOn() {
        System.out.println(brand + " appliance is now turned on.");
    }
}


class Refrigerator extends Appliance {
    double capacity;


    Refrigerator(String brand, int power, double capacity) {
        super(brand, power); 
        this.capacity = capacity;
    }

   
    void cool() {
        System.out.println("Cooling food in the " + brand + " refrigerator with a capacity of " + capacity + " liters.");
    }
}

class SmartRefrigerator extends Refrigerator {
    String os;

   
    SmartRefrigerator(String brand, int power, double capacity, String os) {
        super(brand, power, capacity); 
        this.os = os;
    }

    
    void controlViaApp() {
        System.out.println("Controlling the " + brand + " Smart Refrigerator using " + os + " app.");
    }
}