package homeworkweek08;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if (secondNumber == 0){
            return 0;
        }else{
            return firstNumber / secondNumber;
        }
    }

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();       //object creation
        calculator.setFirstNumber(5.0);     //set value for first number
        calculator.setSecondNumber(4);      // set value for second number
        System.out.println("add= " + calculator.getAdditionResult());   //print statement
        System.out.println("subtract= " + calculator.getSubtractionResult()); //print statement
        calculator.setFirstNumber(5.25);    //set value for first number
        calculator.setSecondNumber(0);      // set value for second number
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
