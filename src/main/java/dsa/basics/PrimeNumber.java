package dsa.basics;
/*
Prime number is a number that is greater than 1 and divided by 1 or itself only. 
In other words, prime numbers can't be divided by other numbers than itself or 1. 
For Example, 2, 3, 5, 7, 11 are the prime numbers.
 */
public class PrimeNumber {

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int divisor = 2;
        while (divisor * divisor <= number) {
            if (number % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println(isPrime(number));
    }
}