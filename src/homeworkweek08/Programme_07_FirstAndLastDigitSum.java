package homeworkweek08;

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
    }
}
