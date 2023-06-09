package homeworkweek08;

/**
 * This is the program to check Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
   within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Programme_13_SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
       // conditional loop to accept 10 to 99 numbers only
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;

        } else {
            boolean answer = false;
            int lefta = a / 10;
            int righta = a % 10;
            int leftb = b / 10;
            int rightb = b % 10;
            if(lefta == leftb || lefta == rightb || righta == leftb || righta == rightb) {
                answer = true;
            }
        }
        return true;
    }



    public static void main(String[] args) {


        System.out.println(" The number is Share Digits : " + hasSharedDigit(12, 23));
        System.out.println(" The number is Share Digits : " + hasSharedDigit(9, 99));
        System.out.println(" The number is Share Digits : " +  hasSharedDigit(15, 55));


    }


}
