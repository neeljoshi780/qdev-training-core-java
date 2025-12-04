import java.util.*;

// Student class
class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override toString for easier printing
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

// Comparator for sorting students by name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Comparing students by name alphabetically
        return s1.getName().compareTo(s2.getName());
    }
}

// Comparator for sorting students by age
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Comparing students by age in ascending order
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

/**
 * Demonstrates sorting a list of `Student` objects using custom comparators.
 * 
 * The program:
 * 1. Defines a `Student` class with `name` and `age`.
 * 2. Uses `NameComparator` to sort students alphabetically by name.
 * 3. Uses `AgeComparator` to sort students by age in ascending order.
 * 
 * This example shows how to use the `Comparator` interface to sort objects by different criteria.
 * 
 * @author Neel Joshi
 * @version 1.0.o
 * @since 2025-12-03
 */
public class ComparatorExample {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20));
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 19));
        students.add(new Student("Diana", 21));

        // Print original list
        System.out.println("Original List:");
        students.forEach(System.out::println);

        // Sorting students by name (using NameComparator)
        students.sort(new NameComparator());
        System.out.println("\nSorted by Name (Alphabetically):");
        students.forEach(System.out::println);

        // Sorting students by age (using AgeComparator)
        students.sort(new AgeComparator());
        System.out.println("\nSorted by Age:");
        students.forEach(System.out::println);
    }
}