package JavaPrct;

import java.util.Scanner;

/**
 * Created by akshay.pokley on 1/10/2019.
 */
public class RemovecharusingByUser extends Removechar {

    public static void main(String args[] )
    {
        System.out.println("Please enter animal name :");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println("Animal Name ::"+str);

        System.out.println("Which char you want to replace :");
        Scanner scannerq=new Scanner(System.in);
        char c = scannerq.next().charAt(0);


        System.out.println("Actual Output-->"+removchar(str,c));

    }
}
