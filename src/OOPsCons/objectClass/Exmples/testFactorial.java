package OOPsCons.objectClass.Exmples;

import java.util.Scanner;

/**
 * Created by akshay.pokley on 6/12/2018.
 */
public class testFactorial {

    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in),s2=new Scanner(System.in);

        System.out.println("Enter the Value for Factorizition"+" =>");

        int j=scanner.nextInt();
        new factorial().fact(j);

        System.out.println("Enter the Value for Factorizition"+" =>");

        int N=s2.nextInt();
        new factorial().fact(N);

    }
}
