package homeworkweek08;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */
public class Programme_06_TrianglePattern {


    public static void main(String[] args) {

        int r;
        int c;
        int number;
        int n = 10;

        //loop for rows
        for (r = 0; r < n; r++) {
            number = 1;

            //loop for columns
            for (c = 0; c <= r; c++) {

                //prints num
               System.out.print(number + " ");
                System.out.print("@ ");
                //incrementing the value of number
                number++;
            }
            //throws the cursor at the next line after printing each row
            System.out.println();
        }


    }
}
