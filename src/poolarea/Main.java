package poolarea;

public class Main {

        public static void main(String[] args) {
            Rectangle rectangle= new Rectangle(5,10); // creating an object of rectangle class
            System.out.println("Rectangle.width =" +rectangle.getWidth()); // calling an instance method of rectangle class
            System.out.println("Rectangle.length =" +rectangle.getLength()); // calling an instance method of rectangle class
            System.out.println("Rectangle.Area =" +rectangle.getArea()); // calling an instance method of rectangle class
            Cuboid cuboid= new Cuboid(5,10,5); // creating an object of cuboid class
            System.out.println("Cuboid.width = " +cuboid.getWidth()); // calling an instance method of cuboid class
            System.out.println("Cuboid.length = " +cuboid.getLength()); // calling an instance method of cuboid class
            System.out.println("Cuboid.area = " +cuboid.getArea()); // calling an instance method of cuboid class
            System.out.println("Cuboid.height= " +cuboid.getHeight()); // calling an instance method of cuboid class
            System.out.println("Cuboid.Volume = " +cuboid.getVolume()); // calling an instance method of cuboid class
        }


    }