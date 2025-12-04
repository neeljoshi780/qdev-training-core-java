// 1. Single Inheritance
class Mammal {

    void eat() {
        System.out.println("Mammal is eating");
    }

}

class DogBreed extends Mammal {

    void bark() {
        System.out.println("Dog is barking");
    }

}

// 2. Multi-level Inheritance
class MammalType {

    void eat() {
        System.out.println("Mammal is eating");
    }

}

class DogBreedType extends MammalType {

    void bark() {
        System.out.println("Dog is barking");
    }

}

class PuppyBreedType extends DogBreedType {

    void play() {
        System.out.println("Puppy is playing");
    }

}

// 3. Hierarchical Inheritance
class AnimalKingdom {

    void eat() {
        System.out.println("Animal is eating");
    }

}

class DogType extends AnimalKingdom {

    void bark() {
        System.out.println("Dog is barking");
    }

}

class CatType extends AnimalKingdom {

    void meow() {
        System.out.println("Cat is meowing");
    }

}

// 4. Hybrid Inheritance (using interfaces for multiple inheritance)
class Vehicle {

    void start() {
        System.out.println("Vehicle started.");
    }

}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving on road.");
    }

}

interface Flyable {

    void fly();

}

interface Swimmable {

    void swim();

}

class FlyingSwimmingCar extends Car implements Flyable, Swimmable {

    // Implementing methods from Flyable interface
    public void fly() {
        System.out.println("Flying car is flying in the sky!");
    }

    // Implementing methods from Swimmable interface
    public void swim() {
        System.out.println("Flying car is swimming in water!");
    }

    // Own method
    void autoPilot() {
        System.out.println("Auto-pilot mode activated.");
    }

}

/**
 * Demonstrates various types of inheritance in Java:
 * 
 * 1. **Single Inheritance**: The `DogBreed` class extends the `Mammal` class, inheriting its `eat()` method 
 * and adding its own `bark()` method.
 * 
 * 2. **Multi-level Inheritance**: The `PuppyBreedType` class extends `DogBreedType`, which in turn extends `MammalType`. 
 * This demonstrates how a subclass can inherit from another subclass, forming a chain of inheritance.
 * 
 * 3. **Hierarchical Inheritance**: Both the `DogType` and `CatType` classes inherit from the common superclass `AnimalKingdom`. 
 * This shows how multiple classes can share a common base class.
 * 
 * 4. **Hybrid Inheritance**: The `FlyingSwimmingCar` class demonstrates hybrid inheritance using **interfaces** (`Flyable` and `Swimmable`) for **multiple inheritance**. 
 * It also extends `Car` to combine both the behaviors of a vehicle and those of flying and swimming.
 * 
 * Each type of inheritance is demonstrated with corresponding method calls for each class.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class InheritanceDemo {

    public static void main(String[] args) {
        // Single Inheritance
        System.out.println("Single Inheritance:");
        DogBreed dog1 = new DogBreed();
        dog1.eat();
        dog1.bark();
    
        // Multi-level Inheritance
        System.out.println("\nMulti-level Inheritance:");
        PuppyBreedType puppy1 = new PuppyBreedType();
        puppy1.eat();
        puppy1.bark();
        puppy1.play();
    
        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        DogType dog2 = new DogType();
        dog2.eat();
        dog2.bark();
    
        CatType cat1 = new CatType();
        cat1.eat();
        cat1.meow();
    
        // Hybrid Inheritance
        System.out.println("\nHybrid Inheritance:");
        FlyingSwimmingCar car = new FlyingSwimmingCar();
        car.start();  // Inherited from Vehicle class
        car.drive();  // Inherited from Car class
        car.fly();    // Implemented from Flyable interface
        car.swim();   // Implemented from Swimmable interface
        car.autoPilot(); // Own method
    }

}