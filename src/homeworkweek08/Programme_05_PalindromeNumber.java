package homeworkweek08;

public class Programme_05_PalindromeNumber {

    public static void main(String[] args) {

        int num = 11211;//It is the number variable to be checked for palindrome

        isPalindrome(num);
    }
    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int number;
        int lastDigit;

        number = num;
        while (num > 0) {
            lastDigit = num % 10;  //getting remainder
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        if (number == reverse) {
            System.out.println("palindrome number ");
            return true;
        } else
            System.out.println("not palindrome");

        return false;
    }

}
