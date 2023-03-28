package encapsulation26;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //set value of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        //Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's Age: " + obj.getAge());
        System.out.println("Prime's RollNo: " + obj.getRollNo());

                // direct access of rollNo is not possible due to encapsulation
                //System.out.println("Prime's rollNo"+obj.greekName);



    }

    }


