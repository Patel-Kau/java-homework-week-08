package cylinder;

public class Main {

//main method

    public static void main(String[] args) {


        Circle circle = new Circle(3.75); // calling a  constructor
        System.out.println("Circle.radius = " + circle.getRadius()); // calling an instance method  of a circle class
        System.out.println("Circle.Area = " + circle.getArea()); // calling an instance method of a circle class
        Cylinder cylinder = new Cylinder(5.55, 7.25); // creating an object
        System.out.println("Cylinder.radius = " + cylinder.getRadius());  // calling an instance method from cylinder class
        System.out.println("Cylinder.height = " + cylinder.getHeight()); // calling an instance method from cylinder class
        System.out.println("Cylinder.area = " + cylinder.getArea()); // calling an instance method from cylinder class
        System.out.println("Cylinder.volume = " + cylinder.getVolume()); // calling an instance method from cylinder class
    }
}
