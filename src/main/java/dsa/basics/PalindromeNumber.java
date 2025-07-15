package dsa.basics;
/*
A given number can be said to be palindromic if the reverse of the given number is the same as that of a given number.
In this article, we will write a Program to check if a number is a Palindrome Number in Java.
*/

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }
}
