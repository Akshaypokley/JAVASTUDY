package Bynaveen.JavaBacis;

/**
 * Created by akshay.pokley on 10/17/2018.
 */
public class ifelseconcepts {

    public static void main(String []args){

        int a=500;
        int b=20;

        if(b>a)
        {
            System.out.println("b is greater than a");
        }else {
            System.out.println("a is greater than b");
        }

        //comparision operators are
        //< ,>, <=,>=, !=,==
        //but = is a Assignment operators not comparision operators /it is used for assign one variable value into another.

        if(a==b)
        {
            System.out.println("value of a is equal to b");
        }else {
            System.out.println("value of a is not equal to b");
        }

        //write a logic to find out highest no

        int i=650;int j=756;int k=504;

        if (i>j & i>k)//false is equal to false -> condition false
        {
            System.out.println("i is a largest no.");
        }else if(j>k) //nested if else condition
        {
            System.out.println("j is a largest no");
        }else {
            System.out.println("k is a largest no");
        }


    }
}
