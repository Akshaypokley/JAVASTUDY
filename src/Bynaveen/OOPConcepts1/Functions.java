package Bynaveen.OOPConcepts1;

/**
 * Created by akshay.pokley on 10/25/2018.
 */
public class Functions {
//Main method is starting point of execution
    public static void main(String args[]){

        Functions functions=new Functions();
        functions.test();
        System.out.println(functions.AddtionMethod());
        System.out.println(functions.QAMethod());
        System.out.println(functions.divisionMethod(12,6));

        //Main method is void ---we never return a value

    }

    //NON-Static Method/Functions

/*    three types of factory are present in above function like 1.NINO
    2.IO
    3.INO*/

//void-- does not return any value

    public void test() //No input No output
    {
    System.out.println("Test Method");
    }
//return type is int it return value of c
    public int AddtionMethod()//No input some output
    {
        System.out.println("Addition method  ");
        int a=10;
        int b=35;
        int c=a+b;
        return c;
    }

    public String QAMethod() //No input some output
    {
        System.out.println("QA Method");
        String s="Selenium";
        return s;
    }

    //x, y are input paramitter/input arguments
    public int divisionMethod(int x,int y)// some  input some output
    {
        System.out.println("Division Method");
        int z=x/y;
        return z;


    }
}
