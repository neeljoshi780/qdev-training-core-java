// Parent class (superclass)
class Animal {

    // Instance variable
    String name;

    // Constructor of parent class
    public Animal(String name) {
        this.name = name;  // Use 'this' to refer to the current class's variable
        System.out.println("Animal constructor called.");
    }

    // Method in parent class
    public void sound() {
        System.out.println("Animal makes sound.");
    }

}

// Child class (subclass) extending Animal class
class Dog extends Animal {

    // Instance variable in the child class
    String name;

    // Constructor of child class
    public Dog(String dogName, String animalName) {
        // Calling the parent class constructor using 'super()'
        super(animalName);
        this.name = dogName;  // Using 'this' to refer to the current class variable
        System.out.println("Dog constructor called.");
    }

    // Overriding the 'sound()' method in the child class
    @Override
    public void sound() {
        super.sound();  // Calling parent class method using 'super'
        System.out.println("Dog barks.");
    }

    // Display method to show the use of 'this' and 'super'
    public void display() {
        System.out.println("Animal's name from super: " + super.name);  // Accessing parent class variable using 'super'
        System.out.println("Dog's name from this: " + this.name);        // Accessing current class variable using 'this'
    }

}

/**
 * This class contains the main method which creates an instance of the Dog class, 
 * calls methods to show how the 'this' keyword refers to the current class instance 
 * and how the 'super' keyword accesses the parent class's variables and methods.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class ThisSuperExample {

    public static void main(String[] args) {
        // Creating an instance of Dog class
        Dog dog = new Dog("Buddy", "Tiger");
    
        // Calling the display method to show both 'this' and 'super' usage
        dog.display();
    
        // Calling the overridden sound() method
        dog.sound();
    }

}