package homeworkweek08;
/**
 *First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * 1. sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * 2. sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * 3. sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
        gives us 0+0 and the sum is 0.
 * 4.sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
         gives us 5+5 and the sum is 10.
 * 5. sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */

import java.util.Scanner;

public class Programme_07_FirstAndLastDigitSum {

   public static int sumFirstAndLastDigit(int number){
       int sum;
       int firstDigit;
       int lastDigit;
      lastDigit = number%10;
      while(number>=10){
          number = number /10;
      }
       firstDigit= number;
      sum =firstDigit + lastDigit;
       return sum;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int number = sc.nextInt();

        System.out.println(" Sum of the First and last digit " + sumFirstAndLastDigit(number));
        sumFirstAndLastDigit(number);
        sc.close();         // Scanner object closing
    }
}
