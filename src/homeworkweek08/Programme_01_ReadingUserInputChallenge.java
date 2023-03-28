package homeworkweek08;

import java.util.Scanner;

public class Programme_01_ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 1;
        int num = 0;
        while (count < 11) {
            System.out.print("Enter number # " + count + " : ");
            boolean n = sc.hasNextInt();
            if (n) {
                num = num + sc.nextInt();
                count++;
            } else {
                System.out.println("Invalid data");
            }
            sc.nextLine();
        }
       Programme_01_ReadingUserInputChallenge obj = new Programme_01_ReadingUserInputChallenge();
        System.out.println("Total value " + obj.calculation(num));


        sc.close();
    }
    public int calculation(int num){
        int answer;
        answer= num + num;
        return answer;
    }
}
