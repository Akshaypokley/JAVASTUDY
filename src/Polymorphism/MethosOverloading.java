package Polymorphism;

/**
 * Created by akshay.pokley on 1/4/2019.
 */
public class MethosOverloading {

    void sum(int a, int b) {
        int res = a + b;
        System.out.println("Addtion of A+B :"+res);


    }

    void sum(int a, int b,int c)
    {
        int res = a + b+c;
        System.out.println("Addtion of A+B+C :"+res);


    }

    public static void main(String args[])
    {
        MethosOverloading methosOverloading=new MethosOverloading();
        methosOverloading.sum(4,6);
        methosOverloading.sum(5,6,8);
    }
}
