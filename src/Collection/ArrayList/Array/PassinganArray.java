package Collection.ArrayList.Array;

/**
 * Created by akshay.pokley on 6/7/2018.
 */
public class PassinganArray {

    public static void main(String []args){
        String []acars={"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
        PrintArray(acars);
    }

    public static void PrintArray(String []Array)
    {
        for (int inum=0;inum<Array.length;inum++)
        {
            System.out.println("The name of the car is ==>"+" "+Array[inum]+" "+"Located on index=>"+inum);
        }
    }
    }
