package homeworkweek08;

public class Programme_04_DigitSumChallenge {

    public static void main(String[] args) {

        int number;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        number = sc.nextInt();
//        sumDigits(number);

        System.out.println("Sum of the number " + sumDigits(125));
        System.out.println("Sum of the number " + sumDigits(-5));
        System.out.println("Sum of the number " + sumDigits(5));
        System.out.println("Sum of the number " + sumDigits(525));

    }


    public static int sumDigits(int number) {
        int digit;
        int sum = 0;
        if (number >= 10) {

            while (number > 0) {
                //finds the last digit of the given number
                digit = number % 10;
                //adds last digit to the variable sum
                sum = sum + digit;
                //removes the last digit from the number
                number = number / 10;
            }
            //prints the result
            //System.out.println("Sum of Digits: " + sum);
        } else {
            System.out.println("Invalid number ");
            return -1;
        }

        return sum;
    }
}
