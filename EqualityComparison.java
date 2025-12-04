import java.math.BigDecimal;

/**
 * Demonstrates the differences between `==` and `.equals()` 
 * when used with String, Integer, and BigDecimal objects.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
public class EqualityComparison {

    public static void main(String[] args) {  
        // 1. String Comparison
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";
    
        System.out.println("1. String Comparison:");
        System.out.println("Using == : " + (str1 == str2));  // false: different memory references
        System.out.println("Using .equals() : " + str1.equals(str2));  // true: same content
        System.out.println("Using == (str1 and str3) : " + (str1 == str3));  // true: same memory reference due to string pooling
        System.out.println("Using .equals() (str1 and str3): " + str1.equals(str3));  // true: same content
    
        System.out.println();
    
        // 2. Integer Comparison
        Integer int1 = Integer.valueOf(100);
        Integer int2 = 100;
        Integer int3 = Integer.valueOf(100);
        Integer int4 = 200;
    
        System.out.println("2. Integer Comparison:");
        System.out.println("Using == (int1 and int2) : " + (int1 == int2));  // false: different references
        System.out.println("Using .equals() (int1 and int2) : " + int1.equals(int2));  // true: same value
        System.out.println("Using == (int1 and int3) : " + (int1 == int3));  // false: different references
        System.out.println("Using .equals() (int1 and int3) : " + int1.equals(int3));  // true: same value
        System.out.println("Using == (int2 and int4) : " + (int2 == int4));  // false: different values
        System.out.println("Using .equals() (int2 and int4) : " + int2.equals(int4));  // false: different values
    
        System.out.println();
    
        // 3. BigDecimal Comparison
        BigDecimal bd1 = new BigDecimal("10.5");
        BigDecimal bd2 = new BigDecimal("10.50");
        BigDecimal bd3 = new BigDecimal("10.5");
    
        System.out.println("3. BigDecimal Comparison:");
        System.out.println("Using == (bd1 and bd2) : " + (bd1 == bd2));  // false: different references
        System.out.println("Using .equals() (bd1 and bd2) : " + bd1.equals(bd2));  // false: different scales
        System.out.println("Using == (bd1 and bd3) : " + (bd1 == bd3));  // false: different references
        System.out.println("Using .equals() (bd1 and bd3) : " + bd1.equals(bd3));  // true: same value and scale
    }

}