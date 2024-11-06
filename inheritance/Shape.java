package inheritance;
class Shape {
    String color;

   
    Shape(String color) {
        this.color = color;
    }

    
    void draw() {
        System.out.println("Drawing a shape of color " + color);
    }
}


class Circle extends Shape {
    double radius;


    Circle(String color, double radius) {
        super(color); 
        this.radius = radius;
    }


    void draw() {
        System.out.println("Drawing a circle of radius " + radius + " and color " + color);
    }
}

class Rectangle extends Shape {
    double length, width;


    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }


    void draw() {
        System.out.println("Drawing a rectangle of length " + length + " and width " + width + " and color " + color);
    }
}

class Triangle extends Shape {
    double base, height;

   
    Triangle(String color, double base, double height) {
        super(color); 
        this.base = base;
        this.height = height;
    }

    
    void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height + " and color " + color);
    }
}
