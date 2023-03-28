package homeworkweek08;

import java.util.Scanner;

public class Programme_02_MinAndMaxInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers ");

        //  int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            System.out.print("Enter numbers ");
            int n = sc.nextInt();
            if (n < min) min = n;
            if (n > max) max = n;

        }

        System.out.println("Max value is : " + max);
        System.out.println("Min value is : " + min);
    }
}
