package homeworkweek08;
/**
 * This program is to Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.
 * - Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class Programme_02_MinAndMaxInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers ");
        //  int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        // check the entered value is number only,
        // if character display error message and ask to re-enter the value again.
        while (sc.hasNextInt()) {
            System.out.print("Enter numbers ");
            int n = sc.nextInt();
            if (n < min) min = n;
            if (n > max) max = n;
        }
        // Display the result
        System.out.println("Max value is : " + max);
        System.out.println("Min value is : " + min);
    }
}
