package carpetcostcalculator;

public class Main {

        public static void main(String[] args) {        //main method

            Carpet carpet= new Carpet(3.5); //carpet object with passing value
            Floor floor= new Floor(2.75,4.0); //floor object with value
            Calculator calculator=new Calculator(floor,carpet); //calculator object with value
            System.out.println("Total=" +calculator.getTotalCost()); //print statement
            carpet =new Carpet(1.5);
            floor=new Floor(5.4,4.5);
            calculator= new Calculator(floor,carpet);
            System.out.println("Total=" +calculator.getTotalCost()); //print statement

        }


    }



