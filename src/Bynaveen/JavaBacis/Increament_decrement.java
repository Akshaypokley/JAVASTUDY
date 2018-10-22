package Bynaveen.JavaBacis;

public class Increament_decrement
{
    public static void main(String [] args)
    {
        //++
        //--

        int i=1;
        int j=i++;//post increment
        System.out.println(i);
        System.out.println(j);
        System.out.println("****************");


        int a=1;
        int b= ++a; //pre increment

        System.out.println(a);
        System.out.println(b);

        System.out.println("****************");


        int a1=2;
        int b1= a1--; //post decrement

        System.out.println(a1);
        System.out.println(b1);

        System.out.println("****************");


        int a2=2;
        int b2= --a2; //pre decrement

        System.out.println(a2);
        System.out.println(b2);
    }
}
