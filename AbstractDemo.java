// Abstract class for Shape
abstract class Shape {
    
    // Abstract method (does not have a body)
    public abstract void draw();
    
    // Regular method (with a body)
    public void description() {
        System.out.println("This is a shape.");
    }
}

// Subclass Circle that extends Shape and provides implementation for draw()
class Circle extends Shape {

    // Providing implementation for the abstract method draw()
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Subclass Rectangle that extends Shape and provides implementation for draw()
class Rectangle extends Shape {

    // Providing implementation for the abstract method draw()
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

/**
 * Demonstrates **data abstraction** using an abstract class (`Shape`) and its concrete subclasses 
 * (`Circle` and `Rectangle`). The program shows how the `draw()` method is implemented in the 
 * subclasses and how the `description()` method is inherited from the abstract class.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class AbstractDemo {

    public static void main(String[] args) {
        // Create an object of Circle (can't create object of Shape directly because it's abstract)
        Shape circle = new Circle();
        circle.draw();  // Call the draw method for Circle
        circle.description(); // Call the regular method description
        
        // Create an object of Rectangle
        Shape rectangle = new Rectangle();
        rectangle.draw();  // Call the draw method for Rectangle
        rectangle.description(); // Call the regular method description
    }
}