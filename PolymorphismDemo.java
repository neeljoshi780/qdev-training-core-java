// Compile-time Polymorphism (Method Overloading)
class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloaded method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values (overloaded method)
    public double add(double a, double b) {
        return a + b;
    }
}

// Runtime Polymorphism (Method Overriding)
class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

/**
 * This program demonstrates the concept of Encapsulation in Java. 
 * It defines a `BankAccount` class with private fields to store account details 
 * and provides public methods (getter and setter) to access and modify those details. 
 * The `deposit()` and `withdraw()` methods include validation to ensure correct and secure changes 
 * to the account balance.
 * 
 * The main method creates a `BankAccount` object, deposits and withdraws money, and displays the 
 * current balance after each operation.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class PolymorphismDemo {

    public static void main(String[] args) {

        // **Demonstrating Compile-time Polymorphism** (Method Overloading)
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(10, 20));               // Calls add(int, int)
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));        // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));            // Calls add(double, double)

        // **Demonstrating Runtime Polymorphism** (Method Overriding)
        System.out.println("\nDemonstrating Runtime Polymorphism:");

        Animal animal1 = new Dog();  // Upcasting: Animal reference but Dog object
        Animal animal2 = new Cat();  // Upcasting: Animal reference but Cat object

        animal1.sound();  // Calls Dog's overridden method
        animal2.sound();  // Calls Cat's overridden method
    }
}