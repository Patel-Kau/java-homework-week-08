package homeworkweek08;
/**
 *  This is a programme to input any number and check if it is prime or not.
 *  (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

import java.util.Scanner;

public class Programme_12_CheckPrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        isPrime(n);
        sc.close();
    }
    public static void isPrime(int num) {
        boolean isPrime;
        if (num < 2)
            isPrime = false;
        else
            isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("The number is a prime number");
        else
            System.out.println("The number is not a prime number");
    }
    }