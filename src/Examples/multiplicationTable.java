package Examples;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by akshay.pokley on 6/7/2018.
 */
public class multiplicationTable {

    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the multipled no :-");
        int im=scanner.nextInt();

        for(int In=1;In<11;In++)
        {
            int Res=im*In;

            System.out.println(im+"*"+In+" ="+" "+Res);


        }

    }

}
