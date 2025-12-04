// Define the interface
interface Animal {
    void sound(); // Abstract method

    default void sleep() {
        System.out.println("This animal is sleeping");
    }

    static void breathe() {
        System.out.println("This animal is breathing");
    }
}

// Dog class implements the Animal interface
class Dog implements Animal {
    // Implement the sound method
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class implements the Animal interface
class Cat implements Animal {
    // Implement the sound method
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Bird class implements the Animal interface
class Bird implements Animal {
    // Implement the sound method
    public void sound() {
        System.out.println("Bird chirps");
    }
}

/**
 * Demonstrates the use of interfaces in Java.
 * 
 * Key Concepts:
 * 1. Interface definition with abstract (`sound()`), default (`sleep()`), and static (`breathe()`) methods.
 * 2. Implementation of the `Animal` interface by classes `Dog`, `Cat`, and `Bird`.
 * 3. Polymorphism by calling overridden methods using interface references.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        
        // Creating objects of Dog, Cat, and Bird
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();
        
        // Calling the sound method (polymorphism)
        System.out.println("Dog:");
        dog.sound();
        
        System.out.println("\nCat:");
        cat.sound();
        
        System.out.println("\nBird:");
        bird.sound();
        
        // Calling the default method
        System.out.println("\nCalling the default sleep method from the interface:");
        dog.sleep();
        cat.sleep();
        bird.sleep();
        
        // Calling the static method
        System.out.println("\nCalling the static breathe method from the interface:");
        Animal.breathe();
    }
}