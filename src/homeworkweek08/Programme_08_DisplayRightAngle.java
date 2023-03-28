package homeworkweek08;

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

                //prints num
               System.out.print("@ ");
                //incrementing the value of number
                number++;
            }
            //throws the cursor at the next line after printing each row
            System.out.println();
        }
    }
}
