package homeworkweek08;

/**
 * This is a program in Java to display the pattern like a diamond.using while loop
 *
 */
public class Programme_14_DiamondPattern {

    public static void main(String[] args) {

       int number = 7;
       int m = 1;
       int n;

        while (m <= number) {
            n = 1;

            while (n++ <= number - m) {
               System.out.print(" ");
            }
            n = 1;
           while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();

            m++;
        }


        m = number - 1;

        while (m > 0) {
            n = 1;

          while (n++ <= number - m) {
               System.out.print(" ");
            }
          n = 1;

            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            m--;
        }
    }
}


