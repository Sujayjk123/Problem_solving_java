package inheritance;
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 6);
        Triangle triangle = new Triangle("Green", 3, 5);

        circle.draw(); 
        rectangle.draw();
        triangle.draw(); 
    }
}
