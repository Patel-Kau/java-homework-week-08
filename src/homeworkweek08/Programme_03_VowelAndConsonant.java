package homeworkweek08;

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






