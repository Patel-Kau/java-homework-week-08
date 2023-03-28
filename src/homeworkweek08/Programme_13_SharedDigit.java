package homeworkweek08;

public class Programme_13_SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
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
