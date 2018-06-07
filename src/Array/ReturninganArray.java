package Array;

/**
 * Created by akshay.pokley on 6/7/2018.
 */
public class ReturninganArray {

    public static void main(String args[])
    {
        String []ac=ReturnArray();
        for (int inum=0;inum<ac.length;inum++)
        {
            System.out.println("The name of the car is ==>"+" "+ac[inum]+" "+"Located on index=>"+inum);
        }
    }

    public static String[] ReturnArray() {
        String [] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
        return aArray;
    }
}
