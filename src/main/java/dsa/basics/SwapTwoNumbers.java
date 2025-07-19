package dsa.basics;
/*
Given two integers m and n. The goal is simply to swap their values in the memory block 
and write the java code demonstrating approaches.
 */
public class SwapTwoNumbers {
    
    // Approach 1: Using a temporary variable
    public static void swapUsingTemp(int m, int n) {
        System.out.println("Swap Using Temp");
        System.out.println("Before swap: m = " + m + ", n = " + n);
        
        int temp = m;
        m = n;
        n = temp;
        
        System.out.println("After swap: m = " + m + ", n = " + n);
    }
    
    // Approach 2: Using arithmetic operations (without temp variable)
    public static void swapUsingArithmetic(int m, int n) {
        System.out.println("Swap Using Arithmetic");
        System.out.println("Before swap: m = " + m + ", n = " + n);
        
        m = m + n;
        n = m - n;
        m = m - n;
        
        System.out.println("After swap: m = " + m + ", n = " + n);
    }
    
    // Approach 3: Using XOR bitwise operation
    public static void swapUsingXOR(int m, int n) {
        System.out.println("Swap Using XOR");
        System.out.println("Before swap: m = " + m + ", n = " + n);
        
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        
        System.out.println("After swap: m = " + m + ", n = " + n);
    }
    
    public static void main(String[] args) {
        // Example usage
        swapUsingTemp(10, 20);
        System.out.println();
        
        swapUsingArithmetic(30, 40);
        System.out.println();
        
        swapUsingXOR(50, 60);
    }
}
