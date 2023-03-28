package homeworkweek08;
/**
 * This is a program that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input.
 * If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */

import java.util.Scanner;

public class Programme_03_VowelAndConsonant {

    public static void main(String[] args) {

            Scanner read = new Scanner(System.in);
            System.out.println("Enter the single character form the alphabet : ");
            String a = read.next();
            char alph = a.toUpperCase().charAt(0);      // change to upper case and select 1st character

            // Conditional statement to identify vowel or consonant

            if (alph >= 'A' && alph <='Z'|| alph >= 'a' && alph <='z' ) {
                if (alph == 'A' || alph == 'E' || alph == 'I' || alph == 'O' || alph == 'U') {
                    System.out.println(alph + " is Vowel.");
                } else if (alph != 'A' || alph != 'E' || alph != 'I' || alph != 'O' || alph != 'U') {
                    System.out.println(alph + " is Consonant.");
                }
            }else{
                System.out.println("Error! Please enter alphabet.");
            }
        }
    }






