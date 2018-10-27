package Bynaveen.OOPConcepts1;

public class MethodOveloading {

    public static void main(String args[])
    {
        /*
        * Method overloading:- same method name with different argument*
        * you can not create amethod inside a method
        * duplicate method are not allowed --ie same method name with same number of arguments with same datatypes  are not allowed
        * can we overload the main method ---yes we can overload the main method with different arguments */
        MethodOveloading obj=new MethodOveloading();
        obj.sum();
        obj.sum(3,4);
        obj.sum(2,3,2);
    }

    public static void main(int d)
    {
        MethodOveloading ob2=new MethodOveloading();
        ob2.sum(5,5,5);
    }

    public static void main(int d[],int h)
    {

    }

    /* when the method name is same with different arguments or input parameter or different data types within a same class */

    public void sum()
    {
        System.out.println("Zero Input Zero Output");
    }

    public void sum(int a,int b)
    {
        System.out.println("Sum method with two input paramitter"+a+b);
    }

    public void sum(int a,int b,int c)
    {
        System.out.println("Sum Method with three input paramitter"+a+b+c);
    }
}
