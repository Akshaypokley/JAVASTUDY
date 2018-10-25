package Bynaveen.OOPConcepts1;

/**
 * Created by akshay.pokley on 10/25/2018.
 */
public class CAR {
    int mod;
    int wheel;
    public static void main(String arg[])
    {
        //1. Class is a physical entity where no of entity are there we  define characteristics/properties in the form of method ,variables.


        //how to create the object of main class
        //using new operator...

        CAR car=new CAR();
        CAR car1=new CAR(); CAR car3=new CAR();
        /*1.new Car(); this line is called as object line
                            car1,2,3 is a object reference variable/it representing the object*/

        car.mod=2017;
        car.wheel=4;

        car1.mod=2016;
        car1.wheel=4;

        car3.mod=2018;
        car3.wheel=4;

        System.out.println("Before refereeing the variable ");

        System.out.println(car.mod+" "+car.wheel);
        System.out.println(car1.mod+" "+car1.wheel);
        System.out.println(car3.mod+" "+car3.wheel);

        System.out.println("After refereeing the variable ");

        car=car1;
        car1=car3;
        car3=car;

        car.wheel=car1.wheel;
        car1.wheel=car3.wheel;
        car3.wheel=car.wheel;

        System.out.println(car.mod+" "+car.wheel);
        System.out.println(car1.mod+" "+car1.wheel);
        System.out.println(car3.mod+" "+car3.wheel);

    }
}
