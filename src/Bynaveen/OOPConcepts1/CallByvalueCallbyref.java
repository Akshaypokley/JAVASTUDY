package Bynaveen.OOPConcepts1;

/**
 * Created by akshay.pokley on 10/29/2018.
 */
public class CallByvalueCallbyref {
int i;
int j;

    public static void main(String args[])
    {
        CallByvalueCallbyref obj=new CallByvalueCallbyref();

        int x=12;
        int y=52;

        obj.summethod(x,y);//call by value or pass by value here we just passing copy of input paramitter
        obj.i=50;
        obj.j=60;

        obj.swapMethod(obj);
        System.out.println("after swap");
        System.out.println(obj.i);
        System.out.println(obj.j);
    }

    public int summethod(int a,int b)
    {
         a=20;
         b=52;
        int c=a+b;
        System.out.println(c);
        return c;
    }

    //call by reference /passing the value by object Reference
    public void swapMethod(CallByvalueCallbyref h)
    {

        int temp;
        temp=h.i;
        h.i=h.j;
        h.j=temp;
    }
}
