package homeworkweek08;

/**
 * Display left angle triangle of * using nested for loops
 */
public class Programme_15_LeftAngleTriangle {

    public static void main(String[] args) {

            //i for rows and j for columns

        int i, j, row = 5;
            // Loop for rows
        for (i = 0; i < row; i++) {
            for (j = 2 * (row - i); j >= 6; j--) {
                System.out.print(" ");
            }
            // loop for columns
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}