package Bynaveen.JavaBacis;

/**
 * Created by akshay.pokley on 10/17/2018.
 */
public class StringConcatation {
    public static void main(String args[])
    {
        //+ is a string concatenation , it is operator

        //ln is responsible operator two print the value in new line

        //println is used to print on  the console with output new line space
        //print is just  used to print on  the console
              int a=100;
        int b=200;

        String s1="Akshay";
        String s2="Pokley";


 System.out.println(a+b);
        System.out.println(s1+s2);
        System.out.println(a+b+s1+s2);//300AkshayPokley
        System.out.println(s1+s2+a+b);// Ans will be AkshayPokley100200
        System.out.println(s1+s2+(a+b));//300AkshayPokley
        System.out.println(a+b+s1+s2+a+b+s1+s2);
        System.out.println(a+b+s1+s2+a+"Hellow word"+b+s1+s2);

        System.out.println("The value of a and b is "+a+" "+b);

        System.out.print(s1);

        System.out.print(s2);
    }
}
