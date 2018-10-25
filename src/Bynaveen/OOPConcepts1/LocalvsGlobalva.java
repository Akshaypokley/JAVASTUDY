package Bynaveen.OOPConcepts1;

/**
 * Created by akshay.pokley on 10/25/2018.
 */
public class LocalvsGlobalva {
    //Global Variable scope
    String name= "Akshay";
    int age=25;
    public static void main(String [] arg)
    {
       int i=10;//local variable of main method
        System.out.println(i);
        LocalvsGlobalva  localvsGlobalva=new LocalvsGlobalva();
        System.out.println(localvsGlobalva.age);
    }

    public void met()

    {
        int i=101;//local variable for met method
        int j=5;
        int age=25;
    }
}
