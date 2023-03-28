package homeworkweek08;

/**
 *  This is the program to Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class Programme_08_DisplayRightAngle {

    public static void main(String[] args) {

        int r;
        int c;
        int number;
        int n = 5;

        //loop for rows
        for (r = 0; r < n; r++) {
            number = 1;

            //loop for columns
            for (c = 0; c <= r; c++) {


               System.out.print("@ ");
                //incrementing the number
                number++;
            }

            System.out.println();
        }
    }
}
