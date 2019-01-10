package JavaPrct;

/**
 * Created by akshay.pokley on 1/10/2019.
 */
public class patteren {

    /*
    *Write a program to print below given pattern.
    *1
    *12
    *123
    *1234
    * */

    public static void main(String args[])
    {
        for (int a=1;a<=5;a++)
        {
            for (int k=1;k<=a;k++)
            {
                System.out.print(k+ " ");
            }System.out.println();
        }
    }
}
